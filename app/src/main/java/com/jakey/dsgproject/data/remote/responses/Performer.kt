package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

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