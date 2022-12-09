package data

import kotlinx.browser.window
import kotlinx.coroutines.async
import kotlinx.coroutines.await
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

object Manager {
    suspend fun fetchOrders(): List<Zakaz> = coroutineScope {
        async {
            val response = window
                .fetch("http://5.63.157.51/orders/")
                .await()
                .text()
                .await()
            return@async Json.decodeFromString<List<Zakaz>>(response)
        }.await()


    }
}