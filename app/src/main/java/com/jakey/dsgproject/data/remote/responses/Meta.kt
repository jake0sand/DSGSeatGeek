package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Meta(
    val geolocation: Any = Any(),
    val page: Int = 0,
    @SerializedName("per_page")
    val perPage: Int = 0,
    val took: Int = 0,
    val total: Int = 0
)