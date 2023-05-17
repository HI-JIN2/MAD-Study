package com.example.architecture_pattern_sample.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.architecture_pattern_sample.databinding.ActivityMvvmLoginBinding
import com.example.architecture_pattern_sample.mvvm.viewmodel.LoginViewModel

class MvvmLoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMvvmLoginBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMvvmLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.included.loginBtn.setOnClickListener{
            loginViewModel.login(
                binding.included.etUserName.text.toString(),
                binding.included.etPassword.text.toString()
            )
        }
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        loginViewModel.isLoginSuccessfulFlag.observe(this,loginObserver)

    }

    //데이터 바인딩
    private val loginObserver = Observer<Boolean>{
        isLoginSuccessful ->
        if(isLoginSuccessful){
            Toast.makeText(this@MvvmLoginActivity, "${loginViewModel.userName} success", Toast.LENGTH_SHORT).show()
        } else{
            Toast.makeText(this@MvvmLoginActivity, "failed", Toast.LENGTH_SHORT).show()
        }
    }
}