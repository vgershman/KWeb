package data.components

import csstype.ClassName
import kotlinx.coroutines.*
import kotlinx.js.timers.clearInterval
import kotlinx.js.timers.setInterval
import react.*
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li
import react.router.dom.Link
import kotlin.time.Duration



fun CoroutineScope.launchAfter(
    repeatMillis: Long,
    action: () -> Unit
) = this.async {
    delay(repeatMillis)
    action()
}

external interface SliderProps: Props {
    var index : Int
}

val mainScope = MainScope()

var Slider = FC<SliderProps>{props->
var cindex by useState(props.index)

    fun toggle() {
        console.log("wtf_1")
        if(cindex==6){
            cindex = 1
        }else{
            cindex++
        }
    }

    useEffect {
        mainScope.launchAfter(5000) {
            toggle()
        }
    }

//    useEffect {
//        val interval = setInterval({
//            //it.index++
//            cindex = cindex++
//        }, 3000)
//        clearInterval(interval)
//    }
    a {
        href = "https://3b-s.ru"
        div {
            className = ClassName("slider")
            div {
                className = ClassName("slider-img slider-img-prev")
                key = "sliders/0${cindex - 1}.jpg"
                img {
                    src = "sliders/0${cindex - 1}.jpg"
                    key = "sliders/0${cindex - 1}.jpg"
                }
            }
            li {className = ClassName("slider-img slider-img")
                a{
                    href = "https://3b-s.ru"
                    key = "sliders/0${cindex}.jpg"

                img {
                    key = "sliders/0${cindex}.jpg"
                    src = "sliders/0${cindex}.jpg"
                    alt="Link"
                }}
            }
            div {
                className = ClassName("slider-img slider-img-next")
                key = "sliders/0${cindex + 1}.jpg"
                img {
                    key = "sliders/0${cindex + 1}.jpg"
                    src = "sliders/0${cindex + 1}.jpg"

                }
            }
        }







    }
}

//    div{
//        button{
//            +"Next"
//            onClick=  {
//               toggle()
//            }
//        }
//    }

//const [activeIndex, setActiveIndex] = useState(0);

// Хук Effect
//useEffect(() => {
//    // Запускаем интервал
//    const interval = setInterval(() => {
//        // Меняем состояние
//        setActiveIndex((current) => {
//            // Вычисляем индекс следующего слайда, который должен вывестись
//            const res = current === img.length - 1 ? 0 : current + 1
//            // Возвращаем индекс
//            return res
//        })
//    }, 3000)
//    // Выключаем интервал
//    return () => clearInterval()
//}, [])
//
//// Вычисляем индекс предыдущего слайда
//const prevImgIndex = activeIndex ? activeIndex - 1 : img.length - 1
//// Вычисляем индекс следующего слайда
//const nextImgIndex = activeIndex === img.length - 1 ? 0 : activeIndex + 1