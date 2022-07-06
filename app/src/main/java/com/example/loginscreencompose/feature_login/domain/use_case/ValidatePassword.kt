package com.example.loginscreencompose.feature_login.domain.use_case

class ValidatePassword {

    fun execute(password: String): ValidationResult {
        if (password.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password can't be blank"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}