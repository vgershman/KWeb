package data

import kotlinx.serialization.Serializable

@Serializable
data class Zakaz(
    val id: Int? = null,
    val fullName: String? = null,
    val phone: String? = null,
    val status: String? = null,
    val deadline: Long?,
    val created: Long? = null,
    val edited: Long? = null,
    var elements: ArrayList<ZakazItem>? = arrayListOf()
)

@Serializable
data class ZakazItem(
    val id: Int? = null, val name: String? = null, val serial: String? = null, val price: Int? = null,
    val comment: String? = null
)