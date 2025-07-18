package com.example.dependencyinjection

import javax.inject.Inject

class AuthManager @Inject constructor(
    private val signInService: SignInService,
    private val emailService: EmailService
){
    fun login(email: String, password: String){
        signInService.signIn(email, password)
        emailService.send(to = email, from = "noreply@app.com",body = "Welcome to App")
    }
}