@file:JsModule("react-simple-captcha")

@file:JsNonModule

import react.*

@JsName("loadCaptchaEnginge")
external val loadCaptchaEngine : SomeHzFunction

@JsName("validateCaptcha")
external val validateCaptcha : ValidateFunction

@JsName("LoadCanvasTemplate")
external val Recap: ComponentClass<RecapProps>




external interface RecapProps : PropsWithClassName {
    //var onVerify: (token: String) -> Unit
}