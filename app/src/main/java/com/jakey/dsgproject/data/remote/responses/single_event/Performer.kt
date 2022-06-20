package com.jakey.dsgproject.data.remote.responses.single_event


import com.google.gson.annotations.SerializedName

data class Performer(
    @SerializedName("away_team")
    val awayTeam: Boolean?,
    val colors: Any?,
    val divisions: Any?,
    @SerializedName("has_upcoming_events")
    val hasUpcomingEvents: Boolean?,
    @SerializedName("home_team")
    val homeTeam: Boolean?,
    @SerializedName("home_venue_id")
    val homeVenueId: Any?,
    val id: Int?,
    val image: String?,
    @SerializedName("image_attribution")
    val imageAttribution: Any?,
    @SerializedName("image_license")
    val imageLicense: Any?,
    @SerializedName("image_rights_message")
    val imageRightsMessage: String?,
    val location: Any?,
    val name: String?,
    @SerializedName("num_upcoming_events")
    val numUpcomingEvents: Int?,
    val primary: Boolean?,
    @SerializedName("short_name")
    val shortName: String?,
    val slug: String?,
    val status: String?,
    val type: String?,
    val url: String?
)