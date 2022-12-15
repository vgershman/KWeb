//import dom.html.HTML.div
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot
//import react.dom.html.ReactHTML.div

fun main() {
    val container = document.createElement("div")
    //val x = document.createElement("div")

    document.body!!.appendChild(container)


    val welcome = Wrapper.create {
    }


    createRoot(container).render(welcome)
}