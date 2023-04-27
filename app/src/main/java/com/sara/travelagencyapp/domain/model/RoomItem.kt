package com.sara.travelagencyapp.domain.model

import com.google.gson.annotations.SerializedName

data class RoomItem(
    @SerializedName("idroom") val idRoom: String,
    @SerializedName("price") val price: String,
    @SerializedName("capacity") val capacity: String,
    @SerializedName("booked") val booked: String,
    @SerializedName("hotel") val hotel: HotelItem, //TODO this is the UI model, data model cant be HotelItem, has to be string.

)

data class HotelItem(
    @SerializedName("idhotel") val idHotel: String,
    @SerializedName("logo") val logo: String,
    @SerializedName("hotelname") val name: String,
    @SerializedName("address") val address: String,
    @SerializedName("city") val city: String,
    @SerializedName("stars") val stars: String,
    @SerializedName("website") val website: String,
    @SerializedName("bookedtimes") val bookedTimes: String,
)