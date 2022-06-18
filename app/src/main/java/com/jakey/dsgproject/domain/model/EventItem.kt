package com.jakey.dsgproject.domain.model

data class EventItem(
    val id: Int,
    val title: String,
    val displayLocation: String,
    val dateTimeUtc: String,
    val image: String
)