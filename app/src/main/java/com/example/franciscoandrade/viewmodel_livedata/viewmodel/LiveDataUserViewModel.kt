package com.example.franciscoandrade.viewmodel_livedata.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.franciscoandrade.viewmodel_livedata.User

class LiveDataUserViewModel :ViewModel() {

    //Live Data Observable
    private var userListLiveData: MutableLiveData<MutableList<User>> = MutableLiveData()
    private var userList : MutableList<User> = arrayListOf()

     fun getUserList(): MutableLiveData<MutableList<User>> {
        return userListLiveData
    }

    fun addUser(user:User){
        userList.add(user)
        userListLiveData.value=userList
    }


}