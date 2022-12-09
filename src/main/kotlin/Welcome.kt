import csstype.px
import csstype.rgb
import data.Manager
import data.Zakaz
import react.FC
import react.Props
import emotion.react.css
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.useEffectOnce
import react.useState

external interface WelcomeProps : Props {

}

val mainScope = MainScope()


val Welcome = FC<WelcomeProps> { props ->
    var orders  : List<Zakaz> by useState(emptyList())

    useEffectOnce {
        mainScope.launch {
            orders = Manager.fetchOrders()
        }
    }


    ul {


        orders.forEach {

            li {
                css {
                    padding = 5.px
                    backgroundColor = rgb(8, 97, 22)
                    color = rgb(56, 246, 137)
                }
                +"${it.phone}"
                +"${it.fullName}"
            }
        }
    }


}