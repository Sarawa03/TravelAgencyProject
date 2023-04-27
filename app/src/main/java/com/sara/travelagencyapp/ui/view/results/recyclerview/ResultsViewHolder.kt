package com.sara.travelagencyapp.ui.view.results.recyclerview

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sara.travelagencyapp.databinding.ItemResultsBinding
import com.sara.travelagencyapp.domain.model.HotelItem
import com.sara.travelagencyapp.domain.model.RoomItem
import com.squareup.picasso.Picasso

class ResultsViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val binding = ItemResultsBinding.bind(view)

    fun bind(roomResults: RoomItem, onItemSelected: (String) -> Unit){
        binding.hotelName.text = roomResults.hotel.name
        binding.hotelAddress.text = roomResults.hotel.address
        binding.hotelPrice.text = roomResults.price
        Log.i("PATATA", roomResults.hotel.logo)
        Picasso.get().load(roomResults.hotel.logo).into(binding.hotelLogo)
        Log.i("PATATA", roomResults.hotel.logo)
        binding.root.setOnClickListener { onItemSelected(roomResults.idRoom) }
    }

}