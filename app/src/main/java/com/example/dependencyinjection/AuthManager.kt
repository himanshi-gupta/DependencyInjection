package com.example.dependencyinjection

import javax.inject.Inject
import javax.inject.Named

class AuthManager @Inject constructor(
    private val signInService: SignInService,
    @Named("email") private val notificationService: NotificationService
){
    fun login(email: String, password: String){
        signInService.signIn(email, password)
        notificationService.send(to = email, from = "noreply@app.com",body = "Welcome to App")
    }
}