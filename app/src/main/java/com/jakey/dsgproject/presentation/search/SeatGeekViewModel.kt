package com.jakey.dsgproject.presentation.search

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakey.dsgproject.data.remote.responses.toEventItem
import com.jakey.dsgproject.domain.SeatGeekRepository
import com.jakey.dsgproject.domain.model.EventItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SeatGeekViewModel @Inject constructor(private val repository: SeatGeekRepository) :
    ViewModel() {

    private val _seatGeekLiveData = MutableLiveData<List<EventItem>>()
    val seatGeekLiveData: LiveData<List<EventItem>> = _seatGeekLiveData


    init {
        getEvents("Swift")

    }


//    fun getEvents(query: String) {
//        viewModelScope.launch {
//            val response = repository.getEvents(query)
//            if (response.isSuccessful) {
//                _seatGeekLiveData.postValue(response.body()?.events?.map { it.toEventItem() } ?: listOf())
//            } else {
//                Log.d("Response", "Response Error: ${response.code().toString()}")
//            }
//        }
//    }

    fun getEvents(query: String) {
        viewModelScope.launch {
            val response = repository.getEvents(query)
            if (response.isSuccessful) {
                val eventItem = response.body()?.events
                if (eventItem != null) {
                    _seatGeekLiveData.postValue(eventItem.map { it.toEventItem() })
                } else {
                    Log.i("ViewModel", "Null response")
                }
            } else {
                Log.d("Response", "Response Error: ${response.code()}")
            }
        }
    }

}