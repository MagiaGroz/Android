package com.example.instagram

import kotlinx.android.parcel.Parcelize
import java.io.Serializable

data class Item(val ImageRes1: Int,val icon: Int,
                val author1: String, val author2: String,
                val description: String ) : Serializable