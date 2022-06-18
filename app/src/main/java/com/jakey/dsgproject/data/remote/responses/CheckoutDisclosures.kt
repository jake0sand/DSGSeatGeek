package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class CheckoutDisclosures(
    val messages: List<Message> = listOf()
)