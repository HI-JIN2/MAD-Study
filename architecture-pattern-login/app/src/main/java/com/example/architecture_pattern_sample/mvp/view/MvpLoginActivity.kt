package com.example.architecture_pattern_sample.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import android.widget.Toast
import com.example.architecture_pattern_sample.databinding.ActivityMvcLoginBinding
import com.example.architecture_pattern_sample.mvc.model.User
import com.example.architecture_pattern_sample.mvp.presenter.LoginPresenterImpl

class MvpLoginActivity : AppCompatActivity(),MvpLoginView {
    private lateinit var binding: ActivityMvcLoginBinding


    private lateinit var loginPresenterImpl: LoginPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMvcLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        loginPresenterImpl=LoginPresenterImpl(this)
        binding.included.loginBtn.setOnClickListener{ loginPresenterImpl.login() }

    }

    override val userName: String
        get() = binding.included.etUserName.text.toString()
    override val password: String
        get() = binding.included.etPassword.text.toString()

    override fun onLoginResult(isLoginSuccess: Boolean?) {
        if(isLoginSuccess==true){
            Toast.makeText(this@MvpLoginActivity, "$userName Login success", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@MvpLoginActivity, "Login failed", Toast.LENGTH_SHORT).show()

        }
    }
}