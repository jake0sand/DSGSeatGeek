package com.jakey.dsgproject.data.remote.responses

import com.jakey.dsgproject.domain.model.EventItem

data class Event(

    val datetime_utc: String = "",

    val id: Int = 0,

    val performers: List<Performer> = listOf(),

    val title: String = "",
    val type: String = "",
    val url: String = "",
    val venue: Venue = Venue(),
)

fun Event.toEventItem(): EventItem {
    return EventItem(
        id = id,
        title = title,
        displayLocation = venue.display_location,
        dateTimeUtc = datetime_utc,
        image = performers[0].image,
        isFavorite = false
    )
}