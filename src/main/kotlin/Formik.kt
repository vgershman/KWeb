@file:JsModule("react-google-recaptcha-v3")

@file:JsNonModule

import org.w3c.dom.HTMLDivElement
import react.*
import react.dom.events.EventHandler
import react.dom.events.FormEventHandler

@JsName("GoogleReCaptchaProvider")
external val Recap: ComponentClass<RecapProps>


external interface RecapProps : PropsWithClassName{
    var reCaptchaKey : String
//    var onChange: dynamic
//    var onErrored : ()->Unit



}