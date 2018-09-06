package com.example.franciscoandrade.viewmodel_livedata.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.franciscoandrade.viewmodel_livedata.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnViewModelAdd.setOnClickListener { startActivity(Intent(this, ViewModelAddActivity::class.java))}
        btnViewModelUser.setOnClickListener { startActivity(Intent(this, ViewModelUserActivity::class.java))}
        btnLiveData.setOnClickListener { startActivity(Intent(this, LiveDataActivity::class.java))}
    }
}
