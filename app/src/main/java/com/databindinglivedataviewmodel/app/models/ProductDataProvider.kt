package com.databindinglivedataviewmodel.app.models

object ProductDataProvider {
    var productList: MutableList<Product> = ArrayList()

    private fun addProduct(
        itemId: String,
        itemName: String,
        itemDescription: String,
        itemPrice: Double,
        itemSalePrice: Double,
        rating: Float,
        totalRating: Int
    ) {
        val item = Product(
            itemId,
            itemName,
            itemDescription,
            itemPrice,
            itemSalePrice,
            rating,
            totalRating,
            "img1.png"
        )
        productList.add(item)
    }

    init {
        addProduct(
            "shirt101",
            "Shirt",
            "This is dummy data of testing of shirt and we just test the DataBinding in kolin",
            55.5, 0.0, 4.5F, 26
        )
        addProduct(
            "shirt101",
            "Shirt",
            "This is dummy data of testing of shirt and we just test the DataBinding in kolin",
            55.5, 0.0, 4.5F, 26
        )
        addProduct(
            "shirt101",
            "Shirt",
            "This is dummy data of testing of shirt and we just test the DataBinding in kolin",
            55.5, 0.0, 4.5F, 26
        )
        addProduct(
            "shirt101",
            "Shirt",
            "This is dummy data of testing of shirt and we just test the DataBinding in kolin",
            55.5, 0.0, 4.5F, 26
        )
        addProduct(
            "shirt101",
            "Shirt",
            "This is dummy data of testing of shirt and we just test the DataBinding in kolin",
            55.5, 0.0, 4.5F, 26
        )
    }
}