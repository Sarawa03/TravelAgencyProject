package com.sara.travelagencyapp.ui.view.results

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sara.travelagencyapp.R
import com.sara.travelagencyapp.databinding.FragmentResultsBinding
import com.sara.travelagencyapp.domain.model.HotelItem
import com.sara.travelagencyapp.domain.model.RoomItem
import com.sara.travelagencyapp.ui.view.results.recyclerview.ResultsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultsFragment : Fragment() {


    private lateinit var adapter: ResultsAdapter
    private var _binding: FragmentResultsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initTestValues()

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentResultsBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun initTestValues() {
        val listResults = listOf(
            RoomItem(
                "1",
                "600",
                "3",
                "false",
                HotelItem(
                    "1",
                    "https://i.imgur.com/ovdt3fU.png",
                    "IKOS ARIA",
                    "Suburban Road Kefalos, Kos, Greece, Kefalos, 85301, Greece",
                    "Greece",
                    "5",
                    "https://ikosresorts.com/resorts/ikos-aria",
                    "3"
                )
            )
        )
        adapter.updateList(listResults)
    }
    private fun initUI() {
        adapter = ResultsAdapter{navigateToDetail(it)}
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerView.adapter = adapter
    }

    private fun navigateToDetail(id: String) {

    }

}