package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to : String, from : String, body : String)
}

class EmailService @Inject constructor(): NotificationService{

    override fun send(to : String, from : String, body : String){
        Log.d("DI","Email Sent to $to!")
    }
}

class MessageService(): NotificationService{

    override fun send(to : String, from : String, body : String){
        Log.d("DI","Email Sent to $to!")
    }
}