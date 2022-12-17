package data

import kotlinx.browser.window
import kotlinx.coroutines.async
import kotlinx.coroutines.await
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.w3c.fetch.RequestInit
import kotlin.js.json

object Manager {

    suspend fun createOrder(zakaz: Zakaz): Int = coroutineScope {
        val headers = json(
            "Accept" to "application/json",
            "Content-Type" to "application/json"
        )

        async {

            val response = window
                .fetch(
                    "http://5.63.157.51/orders/",
                    RequestInit(method = "put", body = JSON.stringify(zakaz), headers = headers)
                )
                .await()
                .text()
                .await()
            return@async 1//Json.decodeFromString<List<Zakaz>>(response)
        }.await()
    }

    suspend fun fetchOrders(phone: String): List<Zakaz> = coroutineScope {
        async {
            val response = window
                .fetch("http://5.63.157.51/orders/search/?phone=${phone}")
                .await()
                .text()
                .await()
            return@async Json.decodeFromString<List<Zakaz>>(response)
        }.await()
    }

    suspend fun SentTg(text: String): Boolean = coroutineScope {
        async {
            val response = window
                .fetch("https://api.telegram.org/bot5623525409:AAGBl9k4QKaZjAWGqAQVBqdrMUxdhNJ4aOg/sendMessage?chat_id=298319053&text=${text}")
                .await()
                .text()
                .await()


            return@async true
        }.await()


    }


}