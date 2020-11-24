package com.databindinglivedataviewmodel.app.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.databindinglivedataviewmodel.app.R
import com.databindinglivedataviewmodel.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)
    }
}