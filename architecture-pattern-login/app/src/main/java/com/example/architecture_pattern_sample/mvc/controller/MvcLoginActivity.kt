package com.example.architecture_pattern_sample.mvc.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import android.widget.Toast
import com.example.architecture_pattern_sample.databinding.ActivityMvcLoginBinding
import com.example.architecture_pattern_sample.mvc.model.User

class MvcLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMvcLoginBinding


    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMvcLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        user=User()


        binding.included.loginBtn.setOnClickListener{
            val isLoginSuccessful = user.login(
                binding.included.etUserName.text.toString(),
                binding.included.etPassword.text.toString()
            )
            if(isLoginSuccessful){
                Toast.makeText(this@MvcLoginActivity, "${user.userName} success", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MvcLoginActivity, "failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}