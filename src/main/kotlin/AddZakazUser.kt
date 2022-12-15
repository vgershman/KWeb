import csstype.ClassName
import csstype.HtmlAttributes
import data.Manager
import data.Zakaz
import emotion.react.css
import kotlinx.browser.window
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable
import org.w3c.dom.get
import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.ul
import react.useState
import csstype.px
import RecapProps
import Recap

class NewZakazProps : Props {
    var fullname: String = ""
    var phone: String = ""

    var name: String? = ""
    var comment: String? = ""
}


class MessageProps : Props {
    var message: String = ""
}



val AddZakazUser = FC<NewZakazProps> { props ->
    var fullname by useState(props.fullname)
    var phone by useState(props.phone)
    var name1 by useState(props.name)
    var comment by useState(props.comment)


    var tgSent: Boolean by useState(false)
    Recap{
        reCaptchaKey = "6LfUwYAjAAAAAKzu4zDQcR5pLRo7knkUc0YKzj93"

       ul { css{ paddingLeft = 40.px}
        h1 {
            +"  Оставьте заявку"
        }
        div {

            div {
                className = ClassName("form-group")

                +"   Имя:"
                input {


                    name = "name"
                    type = InputType.text
                    className = ClassName("form-control")
                    onChange = { event ->
                        fullname = event.target.value
                    }
                }
                +"   Телефон:"
                input {


                    name = "phone"
                    type = InputType.email
                    className = ClassName("form-control")
                    onChange = { event ->
                        phone = event.target.value
                    }
                }
                +"   Модель техники:"
                input {

                    name = "name"
                    type = InputType.email
                    className = ClassName("form-control")
                    onChange = { event ->
                        name1 = event.target.value
                    }
                }
                +"   Проблема:"
                input {

                    name = "comment"
                    type = InputType.email
                    className = ClassName("form-control")
                    onChange = { event ->
                        comment = event.target.value
                    }
                    value = comment
                }


                if(!tgSent) {
                    button {
                        +"Отправить"
                        className = ClassName("btn btn-primary")
                        onClick = {
                            mainScope.launch {
                                tgSent = Manager.SentTg("$fullname $phone $name1 $comment")
                                console.log(tgSent.toString())
                                if (tgSent) {
                                    name1 = ""
                                    comment = ""
                                    fullname = ""
                                    phone = ""

                                }
                            }

                        }
                    }
                }
                if(tgSent){
                    h3{
                        +"Заявка принята!"
                    }
                }

                div {
                    //Recap {
                  //  }
                }
            }
            }
        }

    }
}

//    <div className="App">
//    <h1>Contact Us</h1>
//    <Formik
//    initialValues={{ name: "", email: "" }}
//    onSubmit={async (values) => {
//        await new Promise((resolve) => setTimeout(resolve, 500));
//        alert(JSON.stringify(values, null, 2));
//    }}
//    >
//    <Form>
//    <Field name="name" type="text" />
//    <Field name="email" type="email" />
//    <button type="submit">Submit</button>
//    </Form>
//    </Formik>
//    </div>
//    );
//}
//
//ReactDOM.render(<App />, document.getElementById("root"));