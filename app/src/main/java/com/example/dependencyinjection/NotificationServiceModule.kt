package com.example.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

//    @Provides
//    fun getMessageService() : NotificationService{
//        return MessageService()
//    }

    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}