package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {

//    @Provides
//    fun getMessageService() : NotificationService{
//        return MessageService()
//    }

    @Binds
    abstract fun getEmailService(emailService: EmailService) : NotificationService
}