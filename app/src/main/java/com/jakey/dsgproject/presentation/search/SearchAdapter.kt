package com.jakey.dsgproject.presentation.search

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.jakey.dsgproject.BuildConfig
import com.jakey.dsgproject.databinding.SearchItemViewHolderBinding
import com.jakey.dsgproject.domain.model.EventItem


class SearchAdapter: RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {



    inner class SearchViewHolder(val binding: SearchItemViewHolderBinding) :
            RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<EventItem>() {
        override fun areItemsTheSame(oldItem: EventItem, newItem: EventItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: EventItem, newItem: EventItem): Boolean {
            return newItem == oldItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)
    var events: List<EventItem>
        get() = differ.currentList
        set(value) {
            differ.submitList(value)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(SearchItemViewHolderBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val currentEvent = events[position]


        holder.binding.apply {
            tvDateSearch.text = currentEvent.dateTimeUtc
            tvLocationSearch.text = currentEvent.displayLocation
            tvTitleSearch.text = currentEvent.title
            ivSearch.load(currentEvent.image)
            icFavoriteFilled.isVisible = currentEvent.isFavorite
            root.setOnClickListener {
                val action = SearchFragmentDirections.actionSearchFragmentToDetailsFragment(currentEvent.id)
                it.findNavController().navigate(action)
            }

        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }



}