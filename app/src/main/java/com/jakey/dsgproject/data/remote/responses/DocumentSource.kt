package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class DocumentSource(
    @SerializedName("generation_type")
    val generationType: String = "",
    @SerializedName("source_type")
    val sourceType: String = ""
)