package com.jakey.dsgproject.domain

import com.jakey.dsgproject.data.remote.SeatGeekApi
import retrofit2.http.Query
import javax.inject.Inject

class SeatGeekRepository @Inject constructor(
    private val api: SeatGeekApi
) {
    suspend fun getEvents(query: String) = api.getEvents(query = query)

    suspend fun getSingleEvent(id: Int) = api.getEvent(eventId = id)
}