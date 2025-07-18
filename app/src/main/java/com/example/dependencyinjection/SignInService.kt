package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class SignInService @Inject constructor(){

    fun signIn(email : String, password : String){
        Log.d("DI","User Signin initiated!")
    }
}