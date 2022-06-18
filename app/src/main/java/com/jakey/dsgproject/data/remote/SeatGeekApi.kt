package com.jakey.dsgproject.data.remote

import com.jakey.dsgproject.data.remote.responses.SeatGeekResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SeatGeekApi {

    @GET("2/events")
    suspend fun getEvents(
        @Query("client_id") clientId: String = "MTEzMzExMDd8MTY1NTUwNTkwNy45MjMxNDYy",
        @Query("q") query: String
    ): Response<SeatGeekResponse>

}