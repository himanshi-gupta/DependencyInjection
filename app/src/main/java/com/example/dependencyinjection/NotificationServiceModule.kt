package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("message")
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}