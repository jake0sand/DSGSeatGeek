package com.jakey.dsgproject.presentation.search

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.jakey.dsgproject.BuildConfig
import com.jakey.dsgproject.databinding.FragmentSearchBinding
import com.jakey.dsgproject.domain.model.EventItem
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment(), SearchView.OnQueryTextListener {
    
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private val viewModel: SeatGeekViewModel by viewModels()
    private lateinit var mAdapter: SearchAdapter

    val sharedPrefs by lazy {
        requireContext().getSharedPreferences(
            "${BuildConfig.APPLICATION_ID}_sharedPreferences",
            Context.MODE_PRIVATE
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        binding.searchView.setOnQueryTextListener(this)
        binding.searchView.setOnSearchClickListener {
            binding.tvCancel.isVisible = true
        }

        mAdapter = SearchAdapter()
        binding.recyclerView.adapter = mAdapter

        viewModel.seatGeekLiveData.observe(viewLifecycleOwner) {
            it.forEach {
                if (sharedPrefs.getInt(it.id.toString(), -1) == it.id) {
                    it.isFavorite = true
                }
            }
            mAdapter.events = it
        }

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            viewModel.getEvents(query)
        }

        return true
    }

    override fun onQueryTextChange(query: String?): Boolean {
        if (query != null) {
            viewModel.getEvents(query)
        }

        return true
    }

}