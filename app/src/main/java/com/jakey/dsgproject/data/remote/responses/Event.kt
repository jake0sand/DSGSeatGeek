package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

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
)