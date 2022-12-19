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
import data.ZakazItem
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li

external interface ZakazProps : Props {
    var fullName: String
    var phone: String

    var name: String
    var serial: String
    var price: String
    var comment: String



    var send : Int
}


class ElementsProps : Props {
    var message: String = ""
}



val AddZakazAdmin = FC<ZakazProps> { props ->
    var fullName by useState(props.fullName)
    var phone by useState(props.phone)
    var name1 by useState(props.name)
    var serial by useState(props.serial)
    var price by useState(props.price)
    var comment by useState(props.comment)

    var tgSent: Int by useState(props.send)
    var tgSent1: Int by useState(51)

        ul { css{ paddingLeft = 40.px}
            h1 {
                +"  Создать заявку"
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
                            fullName = event.target.value
                        }
                    }
                    +"   Телефон:"
                    input {


                        name = "phone"
                        type = InputType.tel
                        className = ClassName("form-control")
                        onChange = { event ->
                            phone = event.target.value
                        }
                    }
                    +"   Модель техники:"
                    input {

                        name = "name"
                        type = InputType.text
                        className = ClassName("form-control")
                        onChange = { event ->
                            name1 = event.target.value
                        }
                    }
                    +"   Проблема:"
                    input {

                        name = "comment"
                        type = InputType.text
                        className = ClassName("form-control")
                        onChange = { event ->
                            comment = event.target.value
                        }
                        value = comment
                    }
                    +"   Серийный номер:"
                    input {


                        name = "serial"
                        type = InputType.text
                        className = ClassName("form-control")
                        onChange = { event ->
                            serial = event.target.value
                        }
                    }
                    +"   price:"
                    input {


                        name = "price"
                        type = InputType.tel
                        className = ClassName("form-control")
                        onChange = { event ->
                            price = event.target.value
                        }
                    }


                        button {
                            +"Отправить"
                            className = ClassName("btn btn-primary")
                            onClick = {
                                mainScope.launch {
                                    val elements = arrayListOf<ZakazItem>()
                                    elements.add(ZakazItem(null, name1, serial, price.toIntOrNull(),comment))
                                    tgSent1=Manager.createOrder(Zakaz(null, fullName, phone, null, null, null, null, elements))
//props.send = tgSent1
                                }

                            }
                        }


                    li{className = ClassName("social-item")
                        a {

                            href = "http://5.63.157.51/order/${tgSent1}/pdf/"
                            img {
                                src = "pdf.png"
                                alt = "Link"
                            }
                        }
                    }
                        }




                    }

//                if(!tgSent) {
//                    button {
//                        +"Отправить"
//                        className = ClassName("btn btn-primary")
//                        onClick = {
//                            mainScope.launch {
//                                tgSent = Manager.SentTg("$fullname $phone $name1 $comment")
//                                console.log(tgSent.toString())
//                                if (tgSent) {
//                                    name1 = ""
//                                    comment = ""
//                                    fullname = ""
//                                    phone = ""
//
//                                }
//                            }
//
//                        }
//                    }
//                }
//                if(tgSent){
//                    h3{
//                        +"Заявка принята!"
//                    }
//                }

                        div {
                            //Recap {
                            //  }
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