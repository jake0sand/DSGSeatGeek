package com.jakey.dsgproject.data.remote.responses.single_event


import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("access_method")
    val accessMethod: Any?,
    val address: String?,
    val capacity: Int?,
    val city: String?,
    val country: String?,
    @SerializedName("display_location")
    val displayLocation: String?,
    @SerializedName("extended_address")
    val extendedAddress: String?,
    @SerializedName("has_upcoming_events")
    val hasUpcomingEvents: Boolean?,
    val id: Int?,
    val links: List<Any?>?,
    @SerializedName("metro_code")
    val metroCode: Int?,
    val name: String?,
    @SerializedName("name_v2")
    val nameV2: String?,
    @SerializedName("num_upcoming_events")
    val numUpcomingEvents: Int?,
    @SerializedName("postal_code")
    val postalCode: String?,
    val slug: String?,
    val state: String?,
    val timezone: String?,
    val url: String?
)