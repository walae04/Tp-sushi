package org.ldv.sushiapi.dto

class BoxDtoApi(
    val id: Long? = null,
    val pieces: Int,
    val nom: String,
    val image: String?,
    val prix: Double,
    val saveurs: Set<String>,
    val aliments: List<AlimentBoxDtoApi>
) {
}