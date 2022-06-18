package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("document_source")
    val documentSource: DocumentSource = DocumentSource(),
    val id: Int = 0,
    val image: String = "",
    val images: Images = Images(),
    val name: String = "",
    val primary: Boolean = false,
    val slug: String = ""
)