package com.example.loginscreencompose.di

import com.example.loginscreencompose.feature_login.domain.use_case.LoginUseCases
import com.example.loginscreencompose.feature_login.domain.use_case.ValidateEmail
import com.example.loginscreencompose.feature_login.domain.use_case.ValidatePassword
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUseCases(): LoginUseCases {
        return LoginUseCases(
            validateEmail = ValidateEmail(),
            validatePassword = ValidatePassword()
        )
    }
}