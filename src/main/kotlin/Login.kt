import csstype.ClassName
import csstype.px
import data.Manager
import data.Zakaz
import emotion.react.css
import kotlinx.coroutines.launch
import react.FC
import react.Props
import react.create
import react.dom.html.InputType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.input
import react.useState
import react.dom.html.ButtonType
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.label
import react.dom.html.ReactHTML.p
import react.router.useNavigate

class LoginProps : Props {
    var user: String = ""
    var password: String = ""

//    var fullName: String = ""
//    var phone: String = ""
//
//    var name: String = ""
//    var comment: String = ""

}

val Login = FC<LoginProps> { props ->
    var user by useState(props.user)
    var password by useState(props.password)
    var good: Boolean by useState(false)

//    var fullName by useState(props.fullName)
//    var phone by useState(props.phone)
//    var name1 by useState(props.name)
//    var comment by useState(props.comment)

    if (!good) {
        div {
            div {
                className = ClassName("Auth-form-container")
                form {
                    className = ClassName("Auth-form")
                    div {
                        className = ClassName("Auth-form-content")
                        h3 {
                            className = ClassName("Auth-form-title")
                            +"Вход сотрудника"
                        }
                        div {
                            className = ClassName("form-group mt-3")
                            label {
                                +"Имя:"
                            }
                            input {
                                type = InputType.email
                                placeholder = "Ввведите имя"
                                className = ClassName("form-control mt-1")
                            }
                        }
                        div {
                            className = ClassName("form-group mt-3")
                            label {
                                +"Пароль:"
                            }
                            input {
                                type = InputType.password
                                placeholder = "Пароль"
                                className = ClassName("form-control mt-1")
                                onChange = { event ->
                                    password = event.target.value
                                }
                                value = props.password
                            }
                        }
                        div {
                            className = ClassName("d-grid gap-2 mt-3")
                            button {
                                type = ButtonType.submit
                                onClick = {
                                    mainScope.launch {
                                        if (password == "123") {
                                            good = true
                                        }
                                    }

                                }
                                className = ClassName("btn btn-primary")
                                +"Вход"

                            }

                        }
                    }


                }
            }

        }
    }else{




        AddZakazAdmin()

    }
}


//import React, { useState } from "react"
//
//export default function (props) {
//    let [authMode, setAuthMode] = useState("signin")
//
//    const changeAuthMode = () => {
//        setAuthMode(authMode === "signin" ? "signup" : "signin")
//    }
//
//    if (authMode === "signin") {
//        return (
//        <div className="Auth-form-container">
//        <form className="Auth-form">
//        <div className="Auth-form-content">
//        <h3 className="Auth-form-title">Sign In</h3>
//        <div className="text-center">
//        Not registered yet?{" "}
//        <span className="link-primary" onClick={changeAuthMode}>
//                Sign Up
//        </span>
//        </div>


//        <div className="form-group mt-3">

//        <label>Email address</label>
//        <input
//        type="email"
//        className="form-control mt-1"
//        placeholder="Enter email"
//        />

//        </div>
//        <div className="form-group mt-3">
//        <label>Password</label>
//        <input
//        type="password"
//        className="form-control mt-1"
//        placeholder="Enter password"
//        />
//        </div>

//        <div className="d-grid gap-2 mt-3">
//        <button type="submit" className="btn btn-primary">
//        Submit
//        </button>
//        </div>

//        <p className="text-center mt-2">
//        Forgot <a href="#">password?</a>
//        </p>
//        </div>
//        </form>
//        </div>
//        )
//    }