package data.components

import csstype.ClassName
import react.VFC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul

val Footer = VFC {
    footer {
        className = ClassName("footer")

        div {
            className = ClassName("container")
            div{
                className = ClassName("footer__wrapper")

                ul{
                    className = ClassName("social")

                    li{
                        className = ClassName("social__item")
                        a{

                            href="http://vk.com"
                            img{
                                src="instagram.svg"
                                alt="Link"
                            }}}
li{
                            a{

                                href="http://vk.com"
                                img{
                                    src="instagram.svg"
                                    alt="Link"
                                }}
                        }


                }
div{
    className = ClassName("copyright")
    p{
        +"© 3b-service 2022 RussianFederation Kazan"
    }
}
            }
        }
    }
}

