package com.sara.travelagencyapp.ui.view.results.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sara.travelagencyapp.R
import com.sara.travelagencyapp.domain.model.HotelItem
import com.sara.travelagencyapp.domain.model.RoomItem
import javax.inject.Inject

class ResultsAdapter @Inject constructor(private val onItemSelected: (String) -> Unit): RecyclerView.Adapter<ResultsViewHolder>(){


    var roomList: List<RoomItem> = emptyList()

    fun updateList(roomList: List<RoomItem>){
        this.roomList = roomList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultsViewHolder {
        return ResultsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_results, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return roomList.size
    }

    override fun onBindViewHolder(holder: ResultsViewHolder, position: Int) {
        holder.bind(roomList[position], onItemSelected)
    }
}