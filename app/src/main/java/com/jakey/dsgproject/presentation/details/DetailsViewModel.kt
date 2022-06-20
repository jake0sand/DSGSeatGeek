package com.jakey.dsgproject.presentation.details

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakey.dsgproject.data.remote.responses.single_event.toEventItem
import com.jakey.dsgproject.domain.SeatGeekRepository
import com.jakey.dsgproject.domain.model.EventItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: SeatGeekRepository) :
    ViewModel() {

    private val _isFavorite = MutableLiveData(true)
    var isFavorite: LiveData<Boolean> = _isFavorite

    private val _detailsLiveData = MutableLiveData<EventItem?>()
    var detailsLiveData: LiveData<EventItem?> = _detailsLiveData

    fun setIsFavorite(boolean: Boolean) {
        viewModelScope.launch {
            _isFavorite.postValue(boolean)
        }
    }

    fun getSingleEvent(id: Int) {
        viewModelScope.launch {
            val response = repository.getSingleEvent(id)
            if (response.isSuccessful) {
                _detailsLiveData.postValue(response.body()?.toEventItem())
            } else {
                Log.e("detailsVM", "Error: ${response.message()}")
            }
        }
    }

}