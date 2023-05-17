package com.example.architecture_pattern_sample.mvp.presenter

import com.example.architecture_pattern_sample.mvc.model.User

interface LoginPresenter {
    val user: User

    fun login()
}