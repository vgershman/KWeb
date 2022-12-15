package data.components

import csstype.ClassName
import csstype.FontWeight
import emotion.react.css
import kotlinext.js.getOwnPropertyNames
//import kotlinx.coroutines.NonCancellable.isActive
import kotlinx.js.Void
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.*
import react.dom.*
import react.router.Route
import react.router.Router
import react.router.dom.*
import react.router.useLocation


val Navbar = FC<Props> {
    val activeLink = "nav-list__link nav-list__link--active"
    val normalLink = "nav-list__link"
    val location = useLocation()
    console.log(location.pathname)
    //location.pathname
    div {
        className = ClassName("nav")

        div {
            className = ClassName("container")

            div {
                className = ClassName("nav-row")



                Link {
                    to = "/"
                    className = ClassName("logo")
//                    css{
//                        fontWeight = FontWeight.bold
//                    }
                    +"3б-сервис"
                }

                ul {

                    className = ClassName("nav-list")

                    li {
                        Link {
                            to = "/poisk"
                            className = if (location.pathname.equals(to)) ClassName(activeLink) else ClassName(normalLink)
                            +"Проверить заказ"
                        }
                        className = ClassName("nav-list__item")


                    }

                    li{
                        Link {
                            to = "/zayavka"
                            className = if (location.pathname.equals(to)) ClassName(activeLink) else ClassName(normalLink)
                           // className = if (isActive) ClassName(activeLink) else ClassName(normalLink)
                            +"Оставить заявку"
                        }
                        className = ClassName("nav-list__item")

                    }
                    li{
                        Link {
                            to = "/login"
                            className = if (location.pathname.equals(to)) ClassName(activeLink) else ClassName(normalLink)
                           // className = if (isActive) ClassName(activeLink) else ClassName(normalLink)
                            +"Контакты"
                        }
                        className = ClassName("nav-list__item")

                    }
                }


            }
        }


    }
}


//


//import './style.css';
//
//const Navbar = () => {
//    const activeLink = 'nav-list__link nav-list__link--active';
//    const normalLink = 'nav-list__link';
//
//    return (
//    <nav className="nav">

//    <div className="container">


//    <div className="nav-row">


//    <NavLink to="/" className="logo">
//    <strong>3Б -</strong> СЕРВИС
//    </NavLink>
//
//    <BtnDarkMode />
//
//    <ul className="nav-list">

//    <li className="nav-list__item">
//    <NavLink
//    to="/"
//    className={({ isActive }) =>
//        isActive ? activeLink : normalLink
//    }
//    >
//    Проверить заказ
//    </NavLink>


//    </li>
//


//    <li className="nav-list__item">
//    <NavLink
//    to="/projects"
//    className={({ isActive }) =>
//        isActive ? activeLink : normalLink
//    }
//    >
//    Оставить заявку
//    </NavLink>
//    </li>


//    <li className="nav-list__item">
//    <NavLink
//    to="/contacts"
//    className={({ isActive }) =>
//        isActive ? activeLink : normalLink
//    }
//    >
//    Контакты
//    </NavLink>
//    </li>

//    </ul>


//    </div>


//    </div>


//    </nav>
//    );
//};
//
//export default Navbar;