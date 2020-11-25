package com.databindinglivedataviewmodel.app.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.databindinglivedataviewmodel.app.models.User

class MainViewModel : ViewModel() {
    var user: User

    init {
        //Here u can use data Repository
        // right now i am use user Constructor
        user = User("Prashant", 35)
    }
}