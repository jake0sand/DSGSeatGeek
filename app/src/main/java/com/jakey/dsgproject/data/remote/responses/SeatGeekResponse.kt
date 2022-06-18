package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.jakey.dsgproject.domain.model.EventItem

data class SeatGeekResponse(
    val events: List<Event> = listOf(),
    val meta: Meta = Meta()
) {
    data class Event(
        @SerializedName("access_method")
        val accessMethod: AccessMethod = AccessMethod(),
        @SerializedName("announce_date")
        val announceDate: String = "",
        val announcements: Announcements = Announcements(),
        val conditional: Boolean = false,
        @SerializedName("created_at")
        val createdAt: String = "",
        @SerializedName("date_tbd")
        val dateTbd: Boolean = false,
        @SerializedName("datetime_local")
        val datetimeLocal: String = "",
        @SerializedName("datetime_tbd")
        val datetimeTbd: Boolean = false,
        @SerializedName("datetime_utc")
        val datetimeUtc: String = "",
        val description: String = "",
        @SerializedName("domain_information")
        val domainInformation: List<Any> = listOf(),
        @SerializedName("enddatetime_utc")
        val enddatetimeUtc: Any = Any(),
        @SerializedName("event_promotion")
        val eventPromotion: Any = Any(),
        val id: Int = 0,
        @SerializedName("is_open")
        val isOpen: Boolean = false,
        val links: List<Any> = listOf(),
        val performers: List<Performer> = listOf(),
        val popularity: Double = 0.0,
        val score: Double = 0.0,
        @SerializedName("short_title")
        val shortTitle: String = "",
        val stats: StatsX = StatsX(),
        val status: String = "",
        val taxonomies: List<TaxonomyX> = listOf(),
        val themes: List<Any> = listOf(),
        @SerializedName("time_tbd")
        val timeTbd: Boolean = false,
        val title: String = "",
        val type: String = "",
        val url: String = "",
        val venue: Venue = Venue(),
        @SerializedName("visible_until_utc")
        val visibleUntilUtc: String = ""
    ){
        data class Performer(
            val colors: Any = Any(),
            val divisions: Any = Any(),
            val genres: List<Genre> = listOf(),
            @SerializedName("has_upcoming_events")
            val hasUpcomingEvents: Boolean = false,
            @SerializedName("home_venue_id")
            val homeVenueId: Any = Any(),
            val id: Int = 0,
            val image: String = "",
            @SerializedName("image_attribution")
            val imageAttribution: String = "",
            @SerializedName("image_license")
            val imageLicense: String = "",
            @SerializedName("image_rights_message")
            val imageRightsMessage: String = "",
            val images: ImagesX = ImagesX(),
            val location: Any = Any(),
            val name: String = "",
            @SerializedName("num_upcoming_events")
            val numUpcomingEvents: Int = 0,
            val popularity: Int = 0,
            val primary: Boolean = false,
            val score: Double = 0.0,
            @SerializedName("short_name")
            val shortName: String = "",
            val slug: String = "",
            val stats: Stats = Stats(),
            val type: String = "",
            val url: String = ""
        )
    }

}

fun SeatGeekResponse.Event.toEventItem(): EventItem {
    return EventItem(
        id = id,
        title = title,
        displayLocation = venue.displayLocation,
        dateTimeUtc = datetimeUtc,
        image = performers[2].toString()
    )
}
