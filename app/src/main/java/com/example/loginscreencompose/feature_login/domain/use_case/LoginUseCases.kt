package com.example.loginscreencompose.feature_login.domain.use_case

data class LoginUseCases(
    val validateEmail: ValidateEmail,
    val validatePassword: ValidatePassword
)