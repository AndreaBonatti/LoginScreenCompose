package com.example.loginscreencompose.feature_login.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null // If errorMessage is not null => error
)
