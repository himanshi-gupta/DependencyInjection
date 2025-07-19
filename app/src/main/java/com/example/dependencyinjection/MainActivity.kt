package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dependencyinjection.ui.theme.DependencyInjectionTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var authManager: AuthManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val component = DaggerAuthManagerComponent.create()
        component.inject(this)
        authManager.login("user@example.com", "password123")
        setContent {
            DependencyInjectionTheme {

            }
        }
    }
}
