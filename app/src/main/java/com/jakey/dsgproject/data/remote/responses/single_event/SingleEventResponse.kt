package com.jakey.dsgproject.data.remote.responses.single_event


import com.google.gson.annotations.SerializedName
import com.jakey.dsgproject.domain.model.EventItem

data class SingleEventResponse(
    @SerializedName("access_method")
    val accessMethod: Any?,
    @SerializedName("announce_date")
    val announceDate: String?,
    val approved: Boolean?,
    val archived: Boolean?,
    @SerializedName("away_team")
    val awayTeam: Any?,
    val conditional: Boolean?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("date_tbd")
    val dateTbd: Boolean?,
    @SerializedName("datetime_local")
    val datetimeLocal: String?,
    @SerializedName("datetime_tbd")
    val datetimeTbd: Boolean?,
    @SerializedName("datetime_utc")
    val datetimeUtc: String?,
    val description: String?,
    @SerializedName("domain_information")
    val domainInformation: List<Any>?,
    @SerializedName("enddatetime_utc")
    val enddatetimeUtc: Any?,
    @SerializedName("event_promotion")
    val eventPromotion: Any?,
    @SerializedName("general_admission")
    val generalAdmission: Boolean?,
    @SerializedName("home_team")
    val homeTeam: Any?,
    val id: Int?,
    @SerializedName("is_open")
    val isOpen: Boolean?,
    val links: List<Any>?,
    val performers: List<Performer>?,
    @SerializedName("short_title")
    val shortTitle: String?,
    @SerializedName("taxonomy_id")
    val taxonomyId: Int?,
    val themes: List<Any>?,
    @SerializedName("time_tbd")
    val timeTbd: Boolean?,
    val title: String?,
    val type: String?,
    val url: String?,
    val venue: Venue?,
    @SerializedName("visible_until_utc")
    val visibleUntilUtc: String?
)

fun SingleEventResponse.toEventItem(): EventItem {
    return EventItem(
        id = id ?: 0,
        title = title ?: "",
        displayLocation = venue?.displayLocation ?: "",
        dateTimeUtc = datetimeUtc ?: "",
        image = performers?.get(0)?.image ?: "",
        isFavorite = false
    )
}