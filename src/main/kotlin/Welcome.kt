import data.components.Slider
import kotlinx.coroutines.MainScope
import react.FC
import react.Props
import react.dom.html.ReactHTML.div


external interface WelcomeProps : Props {

}

val mainScope = MainScope()


val Welcome = FC<WelcomeProps> { props ->


    div {
        Slider{
            index = 1
        }
    }

}