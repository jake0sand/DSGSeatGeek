package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class StatsX(
    @SerializedName("average_price")
    val averagePrice: Int = 0,
    @SerializedName("dq_bucket_counts")
    val dqBucketCounts: List<Int> = listOf(),
    @SerializedName("highest_price")
    val highestPrice: Int = 0,
    @SerializedName("listing_count")
    val listingCount: Int = 0,
    @SerializedName("lowest_price")
    val lowestPrice: Int = 0,
    @SerializedName("lowest_price_good_deals")
    val lowestPriceGoodDeals: Int = 0,
    @SerializedName("lowest_sg_base_price")
    val lowestSgBasePrice: Int = 0,
    @SerializedName("lowest_sg_base_price_good_deals")
    val lowestSgBasePriceGoodDeals: Int = 0,
    @SerializedName("median_price")
    val medianPrice: Int = 0,
    @SerializedName("visible_listing_count")
    val visibleListingCount: Int = 0
)