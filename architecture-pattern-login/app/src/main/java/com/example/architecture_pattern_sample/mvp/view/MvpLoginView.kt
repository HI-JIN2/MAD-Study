package com.example.architecture_pattern_sample.mvp.view

interface MvpLoginView {
    val userName : String?
    val password : String?

    fun onLoginResult(isLoginSuccess: Boolean?)
}