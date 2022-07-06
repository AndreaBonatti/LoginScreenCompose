package com.example.loginscreencompose.feature_login.presentation

sealed class LoginFormEvent {
    data class EmailChanged(val email: String) : LoginFormEvent()
    data class PasswordChanged(val password: String) : LoginFormEvent()

    object Submit : LoginFormEvent()
}
