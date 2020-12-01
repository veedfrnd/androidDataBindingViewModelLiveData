package com.databindinglivedataviewmodel.app.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.databindinglivedataviewmodel.app.models.Product
import com.databindinglivedataviewmodel.app.models.ProductDataProvider

class ProductViewModel(application: Application) : AndroidViewModel(application) {
    private var product = ProductDataProvider.productList.get(1)
    fun getProduct(): Product = product
}