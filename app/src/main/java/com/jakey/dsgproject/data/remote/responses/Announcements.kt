package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Announcements(
    @SerializedName("checkout_disclosures")
    val checkoutDisclosures: CheckoutDisclosures = CheckoutDisclosures()
)