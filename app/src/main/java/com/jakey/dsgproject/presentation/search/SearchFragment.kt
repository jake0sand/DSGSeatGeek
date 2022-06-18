package com.jakey.dsgproject.presentation.search

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.jakey.dsgproject.R
import com.jakey.dsgproject.data.remote.responses.toEventItem
import com.jakey.dsgproject.databinding.FragmentSearchBinding
import com.jakey.dsgproject.domain.model.EventItem
import com.jakey.dsgproject.presentation.SeatGeekViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment() {
    
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private val viewModel: SeatGeekViewModel by viewModels()
    private lateinit var mAdapter: SearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        Log.i("taggg", viewModel.getEvents("swift").toString())

        mAdapter = SearchAdapter()
        binding.recyclerView.adapter = mAdapter
        viewModel.seatGeekLiveData.observe(requireActivity()) {

        }

        return binding.root
    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}