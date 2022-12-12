import csstype.ClassName
import data.Manager
import data.Zakaz
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.FC
import react.Props
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.useEffectOnce
import react.useState


external interface WelcomeProps : Props {

}

val mainScope = MainScope()


val Welcome = FC<WelcomeProps> { props ->
    var orders: List<Zakaz> by useState(emptyList())

    useEffectOnce {
        mainScope.launch {
            orders = Manager.fetchOrders()
        }
    }


    ul {


        orders.forEach {

            li {
                img {
                    src = "11.jpg"
                    alt = "ХЗХЗ"
                    className = ClassName("project__img")
                }

                h3 {
                    +"${it.phone}"
                    +"${it.fullName}"
                    className = ClassName("project__title")
                }

                className = ClassName("project")
            }

        }
    }


}