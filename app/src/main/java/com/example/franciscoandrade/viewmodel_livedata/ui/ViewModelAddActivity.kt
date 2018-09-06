package com.example.franciscoandrade.viewmodel_livedata.ui

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.franciscoandrade.viewmodel_livedata.Add
import com.example.franciscoandrade.viewmodel_livedata.R
import com.example.franciscoandrade.viewmodel_livedata.viewmodel.AddViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_model_add.*

class ViewModelAddActivity : AppCompatActivity() {

    private lateinit var addViewModel: AddViewModel
    private var num: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_add)



        addViewModel=ViewModelProviders.of(this).get(AddViewModel::class.java)

        tvAdd.text="$num"
        tvAddViewModel.text="${addViewModel.result}"

        btAdd.setOnClickListener {
            num= Add().add(num)
            tvAdd.text="$num"
            addViewModel.result=Add().add(addViewModel.result)
            tvAddViewModel.text="${addViewModel.result}"

        }

    }
}
