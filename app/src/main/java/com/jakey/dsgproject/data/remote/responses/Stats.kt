package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("event_count")
    val eventCount: Int = 0
)