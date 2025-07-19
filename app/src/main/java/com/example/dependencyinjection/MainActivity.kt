package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dependencyinjection.ui.theme.DependencyInjectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authManager = DaggerAuthManagerComponent.create().getAuthManager()
        authManager.login("user@example.com", "password123")
        setContent {
            DependencyInjectionTheme {

            }
        }
    }
}
