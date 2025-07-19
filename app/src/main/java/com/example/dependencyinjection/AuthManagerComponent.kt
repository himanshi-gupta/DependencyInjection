package com.example.dependencyinjection

import dagger.Component

@Component
interface AuthManagerComponent {

    fun inject(mainActivity: MainActivity)

}