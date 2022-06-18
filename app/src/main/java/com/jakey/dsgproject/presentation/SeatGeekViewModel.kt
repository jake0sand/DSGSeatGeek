package com.jakey.dsgproject.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakey.dsgproject.data.remote.responses.SeatGeekResponse
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
        getEvents("Sam")

    }


    fun getEvents(query: String) {
        viewModelScope.launch {
            val response = repository.getEvents(query)
            if (response.isSuccessful) {
                _seatGeekLiveData.postValue(response.body().events)
            } else {
                Log.d("Response", "Response Error: ${response.code().toString()}")
            }
        }
    }

}