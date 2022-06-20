package com.jakey.dsgproject.presentation.details

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.jakey.dsgproject.BuildConfig
import com.jakey.dsgproject.R
import com.jakey.dsgproject.databinding.FragmentDetailsBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.prefs.Preferences.*

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private val viewModel: DetailsViewModel by viewModels()
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val args: DetailsFragmentArgs by navArgs()

    val sharedPrefs by lazy {
        requireContext().getSharedPreferences(
            "${BuildConfig.APPLICATION_ID}_sharedPreferences",
            Context.MODE_PRIVATE
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)

        (activity as AppCompatActivity).setSupportActionBar(binding.materialToolbar)
        binding.materialToolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        viewModel.getSingleEvent(id = args.argsId)

        viewModel.isFavorite.observe(viewLifecycleOwner) { isFavorite ->
            if (sharedPrefs?.getInt(args.argsId.toString(), 0).toString() == args.argsId.toString()) {
                binding.icFavoriteFilled.isVisible = isFavorite
                binding.icFavoriteOutline.isVisible = !isFavorite
            }
            binding.icFavoriteOutline.setOnClickListener {
                sharedPrefs?.edit()?.putInt(args.argsId.toString(), args.argsId)?.apply()
                Log.i("jj", sharedPrefs?.getInt(args.argsId.toString(), 0).toString())
                binding.icFavoriteOutline.isVisible = !isFavorite
                binding.icFavoriteFilled.isVisible = isFavorite
            }


            binding.icFavoriteFilled.setOnClickListener {
                sharedPrefs?.edit()?.remove(args.argsId.toString())?.apply()

                binding.icFavoriteFilled.isVisible = !isFavorite
                binding.icFavoriteOutline.isVisible = isFavorite

            }

        }

        viewModel.detailsLiveData.observe(viewLifecycleOwner) { event ->
            binding.apply {
                if (event != null) {
                    ivDetails.load(event.image)
                    tvDateDetails.text = event.dateTimeUtc
                    tvLocationDetails.text = event.displayLocation
                    tvTitleDetails.text = event.title
                }
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}