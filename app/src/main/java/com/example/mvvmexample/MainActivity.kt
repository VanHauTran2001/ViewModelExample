package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val model:UserViewModel by lazy {
        ViewModelProvider(this)[UserViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val biding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        biding.lifecycleOwner = this
        biding.viewModel = model
    }
}