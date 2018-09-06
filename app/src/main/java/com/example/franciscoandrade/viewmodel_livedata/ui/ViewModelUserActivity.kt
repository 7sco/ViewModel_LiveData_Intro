package com.example.franciscoandrade.viewmodel_livedata.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.franciscoandrade.viewmodel_livedata.R
import com.example.franciscoandrade.viewmodel_livedata.User
import com.example.franciscoandrade.viewmodel_livedata.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_view_model_user.*

class ViewModelUserActivity : AppCompatActivity() {

    lateinit var userList: MutableList<User>
    lateinit var userViewModel:UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_user)

        userViewModel= ViewModelProviders.of(this).get(UserViewModel::class.java)
        userList= arrayListOf()

        saveBtn.setOnClickListener {
            var user: User = User()
            user.age = ageET.text.toString()
            user.name = nameET.text.toString()

            userList.add(user)
            userViewModel.addUser(user)
        }

        lookUpBtn.setOnClickListener {
            var text:String=""

            for (user in userList){
                text+= "${user.name} ${user.age} \n"
            }
            tvUser.text=text
            text=""
            for (user in userViewModel.userList){
                text+= "${user.name} ${user.age} \n"
            }
            tvUserViewModel.text=text

        }
    }
}
