package com.jakey.dsgproject.data.remote.responses

data class EventsResponse(
    val events: List<Event> = listOf(),
    val meta: Meta = Meta()
)