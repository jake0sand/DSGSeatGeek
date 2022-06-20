package com.jakey.dsgproject.data.remote

import com.jakey.dsgproject.data.remote.responses.EventsResponse
import com.jakey.dsgproject.data.remote.responses.single_event.SingleEventResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SeatGeekApi {

    @GET("2/events")
    suspend fun getEvents(
        @Query("client_id") clientId: String = "MTEzMzExMDd8MTY1NTUwNTkwNy45MjMxNDYy",
        @Query("q") query: String
    ): Response<EventsResponse>

    @GET("2/events/{eventId}")
    suspend fun getEvent(
        @Path("eventId") eventId: Int,
        @Query("client_id") clientId: String = "MTEzMzExMDd8MTY1NTUwNTkwNy45MjMxNDYy"
    ): Response<SingleEventResponse>

}