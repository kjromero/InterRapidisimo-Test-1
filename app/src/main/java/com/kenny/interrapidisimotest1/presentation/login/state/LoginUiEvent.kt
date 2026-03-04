package com.kenny.interrapidisimotest1.presentation.login.state

sealed class LoginUiEvent {
    data object NavigateToHome : LoginUiEvent()
}