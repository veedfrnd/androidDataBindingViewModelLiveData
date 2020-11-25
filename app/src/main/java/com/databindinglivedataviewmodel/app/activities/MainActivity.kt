package com.databindinglivedataviewmodel.app.activities

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.databindinglivedataviewmodel.app.R
import com.databindinglivedataviewmodel.app.databinding.ActivityMainBinding
import com.databindinglivedataviewmodel.app.viewmodels.MainViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(this.application)
        ).get(MainViewModel::class.java)

        binding.user = mainViewModel.user
        /*binding.txtOne = "Hello World"
        binding.txtTwo = "Hello World Two"*/
    }
}