package com.example.mvvmexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel  : ViewModel() {
    private val firtName : MutableLiveData<String> = MutableLiveData("Hau")
    private val lastName : MutableLiveData<String> = MutableLiveData("Tran")
    private val like : MutableLiveData<Int> = MutableLiveData(0)

    val firt_name : LiveData<String> = firtName
    val last_name : LiveData<String> = lastName
    val likes : LiveData<Int> = like

    fun setFirtName(firt_name : String){
        firtName.value = firt_name
    }
    fun setLastName(last_name : String){
        firtName.value = last_name
    }
    fun onLikes(){
        like.value = (like.value ?:0) + 1
    }
}