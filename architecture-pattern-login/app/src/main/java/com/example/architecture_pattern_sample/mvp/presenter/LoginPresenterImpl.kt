package com.example.architecture_pattern_sample.mvp.presenter

import com.example.architecture_pattern_sample.mvc.model.User
import com.example.architecture_pattern_sample.mvp.view.MvpLoginView

class LoginPresenterImpl(
    private val mvpLoginView: MvpLoginView
) : LoginPresenter {
    override val user: User
        get() = User()

    override fun login() {
        val userName = mvpLoginView.userName.toString()
        val password = mvpLoginView.password.toString()
        val isLoginSuccessful : Boolean =user.login(userName,password)

        mvpLoginView.onLoginResult(isLoginSuccessful)
    }
}