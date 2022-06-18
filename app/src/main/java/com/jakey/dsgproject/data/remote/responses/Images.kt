package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Images(
    val banner: String = "",
    val block: String = "",
    @SerializedName("criteo_130_160")
    val criteo130160: String = "",
    @SerializedName("criteo_170_235")
    val criteo170235: String = "",
    @SerializedName("criteo_205_100")
    val criteo205100: String = "",
    @SerializedName("criteo_400_300")
    val criteo400300: String = "",
    @SerializedName("fb_100x72")
    val fb100x72: String = "",
    @SerializedName("fb_600_315")
    val fb600315: String = "",
    val huge: String = "",
    @SerializedName("ipad_event_modal")
    val ipadEventModal: String = "",
    @SerializedName("ipad_header")
    val ipadHeader: String = "",
    @SerializedName("ipad_mini_explore")
    val ipadMiniExplore: String = "",
    val mongo: String = "",
    @SerializedName("square_mid")
    val squareMid: String = "",
    @SerializedName("triggit_fb_ad")
    val triggitFbAd: String = "",
    @SerializedName("136x136")
    val x136: String = "",
    @SerializedName("800x320")
    val x320: String = "",
    @SerializedName("500_700")
    val x500700: String = "",
    @SerializedName("1200x525")
    val x525: String = "",
    @SerializedName("1200x627")
    val x627: String = ""
)