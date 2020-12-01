package com.databindinglivedataviewmodel.app.fragments

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.databindinglivedataviewmodel.app.databinding.FragmentProductDetailBinding
import com.databindinglivedataviewmodel.app.models.Product
import com.databindinglivedataviewmodel.app.viewmodels.MainViewModel
import com.databindinglivedataviewmodel.app.viewmodels.ProductViewModel
import kotlinx.android.synthetic.main.fragment_product_detail.view.*

class ProductDetailFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        val productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        binding.product = productViewModel.getProduct()
        setData(binding.root, productViewModel.getProduct())
        return binding.root
    }

    fun setData(rootView: View, product: Product) {
        rootView.imageView.setImageBitmap(getBitmapFromAssets(product.img))
    }

    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        return try {
            BitmapFactory.decodeStream(context?.assets?.open(fileName))
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}