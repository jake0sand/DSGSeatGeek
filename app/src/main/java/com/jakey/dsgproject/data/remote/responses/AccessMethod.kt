package com.jakey.dsgproject.data.remote.responses


import com.google.gson.annotations.SerializedName

data class AccessMethod(
    @SerializedName("created_at")
    val createdAt: String = "",
    @SerializedName("employee_only")
    val employeeOnly: Boolean = false,
    val method: String = ""
)