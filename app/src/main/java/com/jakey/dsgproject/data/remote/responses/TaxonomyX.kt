package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class TaxonomyX(
    val id: Int = 0,
    val name: String = "",
    @SerializedName("parent_id")
    val parentId: Int = 0,
    val rank: Int = 0
)