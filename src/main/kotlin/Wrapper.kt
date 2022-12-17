import csstype.ClassName
import data.Manager
import data.Zakaz
import data.components.Footer
import data.components.Navbar
import history.createHashHistory
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.w3c.dom.ScrollToOptions
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.router.Route
import react.router.Router
import react.router.Routes
import react.router.dom.BrowserRouter
import react.router.dom.HashRouter
import react.router.getToPathname


val Wrapper = VFC {
//    FC<Props> { props ->
div{
    className = ClassName("app")
    val hashHistory = createHashHistory()
    HashRouter{
       // history = hashHistory
        Navbar()

        Routes{
            Route{
                path= "/"
                element = Welcome.create()
            }
            Route{
                path="/poisk"
                element = SearchZakazy.create()
            }
            Route{
                path="/zayavka"
                element = AddZakazUser.create()
            }
            Route{
                path="/login"
                element = Login.create()
            }

        }
        Footer()
   }

}




}
//function App() {
//    return (
//    <div className="App">
//    <Router>
//    <ScrollToTop />
//    <Navbar />
//    <Routes>
//    <Route path="/" element={<Home />} />
//    <Route path="/projects" element={<Projects />} />
//    <Route path="/project/:id" element={<Project />} />
//    <Route path="/contacts" element={<Contacts />} />
//    </Routes>
//    <Footer />
//    </Router>
//    </div>
//    );
//}
//    ul {
//
//
//        orders.forEach {
//
//            li {
//                img {
//                    src = "11.jpg"
//                    alt = "ХЗХЗ"
//                    className = ClassName("project__img")
//                }
//
//                h3 {
//                    +"${it.phone}"
//                    +"${it.fullName}"
//                    className = ClassName("project__title")
//                }
//
//                className = ClassName("project")
//            }
//
//        }
//    }
//
//
//}