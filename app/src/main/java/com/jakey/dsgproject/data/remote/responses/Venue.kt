package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("access_method")
    val accessMethod: AccessMethod = AccessMethod(),
    val address: String = "",
    val capacity: Int = 0,
    val city: String = "",
    val country: String = "",
    @SerializedName("display_location")
    val displayLocation: String = "",
    @SerializedName("extended_address")
    val extendedAddress: String = "",
    @SerializedName("has_upcoming_events")
    val hasUpcomingEvents: Boolean = false,
    val id: Int = 0,
    val links: List<Any> = listOf(),
    val location: Location = Location(),
    @SerializedName("metro_code")
    val metroCode: Int = 0,
    val name: String = "",
    @SerializedName("name_v2")
    val nameV2: String = "",
    @SerializedName("num_upcoming_events")
    val numUpcomingEvents: Int = 0,
    val popularity: Int = 0,
    @SerializedName("postal_code")
    val postalCode: String = "",
    val score: Double = 0.0,
    val slug: String = "",
    val state: String = "",
    val timezone: String = "",
    val url: String = ""
)