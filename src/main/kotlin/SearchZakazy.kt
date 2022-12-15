import csstype.ClassName
import csstype.HtmlAttributes
import csstype.px
import data.Manager
import data.Zakaz
import data.ZakazItem
import emotion.react.css
import kotlinx.coroutines.launch
import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.header
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul
import react.useEffectOnce
import react.useState

class SearchZakazyProps : Props {
    var zakaz: String = ""
}

val SearchZakazy = FC<SearchZakazyProps> { props ->
    var zakaz by useState(props.zakaz)

    var orders: List<Zakaz> by useState(emptyList())


    header {
        className = ClassName("form-group")
        //  className = ClassName("darkMode")
        css{ paddingLeft = 20.px
        paddingTop = 5.px
        }

        ul {
            li{
                input {
                    className = ClassName("form-control")
                    placeholder = "Введите номер телефона"
                    type = InputType.search
                    value = zakaz
                    onChange = { event ->
                        zakaz = event.target.value
                    }
                }



                div {
                    className = ClassName("btn btn-primary")

                    +"Найти заказы"
                    onClick = {
                        mainScope.launch {
                            orders = Manager.fetchOrders(zakaz)
                        }
                    }
                }}
            li {

                if (orders.isNotEmpty()) {
                    ReactHTML.ul {


                        orders.forEach {

                            ReactHTML.li {
                                ReactHTML.img {
                                    src = "11.png"
                                    alt = "ХЗХЗ"
                                    className = ClassName("project__img")
                                }

                                ReactHTML.table {
                                    +"${it.phone} |"
                                    +" ${it.fullName} |"
                                    +" ${it.edited} |"
                                    +" ${it.status} "

                                    it.elements.orEmpty().forEach {
                                        p {
                                            +"${it.name} | ${it.price} "
                                        }
                                    }



                                    //     className = ClassName("project__title")
                                }

                                className = ClassName("form-group")
                            }

                        }
                    }  }
            }
        }
    }

}