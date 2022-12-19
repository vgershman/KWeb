package data.components
import csstype.ClassName
import csstype.HtmlAttributes
import react.VFC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul
import react.router.dom.Link


val Contacts = VFC {

main{
    className=ClassName("section")
    div{
        className=ClassName("container")
        h1{
            className=ClassName("title-1")
            +"Контакты"
        }

        ul{
            className=ClassName("content-list")
            li{
                className=ClassName("content-list__item")
                h2{ className=ClassName("title-2")
                   +"Cайт"
                    p{
                       a{href="3b-s.ru"
                           +"3b-s.ru"
                       }
                    }
                }
            }

            li{
                className=ClassName("content-list__item")
                h2{ className=ClassName("title-2")
+"Telegram / WhatsApp"
                   p{
                       a{
                           href="+79290393965"
                           +"7(927)0393965"
                       }
                   }

                }

            }

            li{
                className=ClassName("content-list__item")
                h2{ className=ClassName("title-2")
                    +"Email"
                    p{
                        a{
                            href="mailto:3bservice3b@gmail.com"
                            +"3bservice3b@gmail.com"
                        }
                    }

                }

            }

        }
    }
}
}
