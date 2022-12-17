package data

import kotlinx.browser.window
import kotlinx.coroutines.async
import kotlinx.coroutines.await
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.json.JsonConfiguration
import org.w3c.fetch.CORS
import org.w3c.fetch.NO_CORS
import org.w3c.fetch.RequestInit
import org.w3c.fetch.RequestMode

object Manager {


    suspend fun createOrder(zakaz: Zakaz): Int = coroutineScope {
        async {


            val headers = mapOf(
                "Access-Control-Allow-Origin" to "*",
                "Access-Control-Allow-Methods" to "GET,PUT,POST,DELETE,PATCH,OPTIONS",
                "Access-Control-Allow-Headers" to "Origin, Content-Type",
                "Content-Type" to "application/json",
                "Accept" to "application/json"
            )

            val response = window
                .fetch("http://0.0.0.0:8081/orders/", RequestInit(method = "PUT", body = JSON.stringify(zakaz), headers = headers, mode = RequestMode.CORS))
                .await()
                .text()
                .await()
            return@async 1//Json.decodeFromString<List<Zakaz>>(response)
        }.await()}
    suspend fun fetchOrders(phone: String): List<Zakaz> = coroutineScope {
        async {
            val response = window
                .fetch("http://5.63.157.51/orders/search/?phone=${phone}")
                .await()
                .text()
                .await()
            return@async Json.decodeFromString<List<Zakaz>>(response)
        }.await()}

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