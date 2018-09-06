package com.example.franciscoandrade.viewmodel_livedata.viewmodel

import android.arch.lifecycle.ViewModel
import com.example.franciscoandrade.viewmodel_livedata.User

class UserViewModel ():ViewModel() {
    var userList: MutableList<User> = arrayListOf()

    constructor(userList : MutableList<User>) : this() {
        this.userList=userList
    }

    fun addUser(user:User){
        userList.add(user)
    }

}