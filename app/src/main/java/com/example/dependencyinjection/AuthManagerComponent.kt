package com.example.dependencyinjection

import dagger.Component

@Component(modules = [NotificationServiceModule::class])
interface AuthManagerComponent {

    fun inject(mainActivity: MainActivity)

}