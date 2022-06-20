package com.jakey.dsgproject.domain.model

data class EventItem(
    val id: Int = 0,
    val title: String = "",
    val displayLocation: String = "",
    val dateTimeUtc: String = "",
    val image: String? = "",
    var isFavorite: Boolean = false
)