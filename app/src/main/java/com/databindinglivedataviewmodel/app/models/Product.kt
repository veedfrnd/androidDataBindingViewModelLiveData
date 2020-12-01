package com.databindinglivedataviewmodel.app.models

data class Product(
    val itemId: String,
    val itemName: String,
    val itemDescription: String,
    val itemPrice: Double,
    val itemSalePrice: Double,
    val rating: Float,
    val totalRating: Int,
    val img:String
)