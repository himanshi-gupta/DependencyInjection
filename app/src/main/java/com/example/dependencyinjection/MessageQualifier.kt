package com.example.dependencyinjection

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()
