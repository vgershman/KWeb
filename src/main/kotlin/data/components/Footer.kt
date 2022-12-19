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
                        className = ClassName("social-item")
                        a{

                            href="https://vk.com/3bservice"
                            img{
                                src="vk.png"
                                alt="Link"
                            }}}
                    li{
                        className = ClassName("social-item")
                        a{

                            href="https://wa.me/+79270393965"
                            img{
                                src="whatsapp.png"
                                alt="Link"
                            }}}
                    li{
                        className = ClassName("social-item")
                        a{

                            href="https://t.me/TBService_bot"
                            img{
                                src="telegram.png"
                                alt="Link"
                            }}}


                    li{
                        className = ClassName("social-item")
                        a{

                            href="https://www.instagram.com/3bservice/"
                            img{
                                src="instagram.png"
                                alt="Link"
                            }}}
                    li{ className = ClassName("social-item")
                        a{

                            href="https://3b-s.ru/"
                            img{
                                src="www.png"
                                alt="Link"
                            }}
                    }

                    li{ className = ClassName("social-item")
                        a{

                            href="https://www.youtube.com/channel/UCt5suw7RY_YiFh1XHIW6vnQ/videos?view=0&sort=p"
                            img{
                                src="youtube.png"
                                alt="Link"
                            }}
                    }


                    li{ className = ClassName("social-item")
                        a{

                            href="https://yandex.ru/maps/org/3b_servis/1708253562/"
                            img{
                                src="yandex.png"
                                alt="Link"
                            }}
                    }
                    li{ className = ClassName("social-item")
                        a{

                            href="https://2gis.ru/kazan/firm/70000001022629043"
                            img{
                                src="2g.png"
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

