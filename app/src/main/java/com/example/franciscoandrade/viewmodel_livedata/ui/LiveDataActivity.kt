package com.example.franciscoandrade.viewmodel_livedata.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.franciscoandrade.viewmodel_livedata.R
import com.example.franciscoandrade.viewmodel_livedata.User
import com.example.franciscoandrade.viewmodel_livedata.viewmodel.LiveDataUserViewModel
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    private lateinit var liveDataUserViewModel: LiveDataUserViewModel
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        liveDataUserViewModel= ViewModelProviders.of(this).get(LiveDataUserViewModel::class.java)
        btSave.setOnClickListener {
            val user = User()
            when (num){
                0 -> {user.name="Isco"
                        user.age="24"}

                1 -> {user.name="And"
                    user.age="25"}

                2 -> {user.name="Xav"
                    user.age="21"}

                3 -> {user.name="Le"
                    user.age="20"}
            }
            num++
            liveDataUserViewModel.addUser(user)
            }

        var listObserver = Observer<MutableList<User>>() {
            var text = ""

            for (user in it!!) {
                text += "${user.name} ${user.age}\n"
            }
            liveDataTv.text = text
        }
        //observe changes in observer and updates list
        liveDataUserViewModel.getUserList().observe(this, listObserver)
        }
    }

