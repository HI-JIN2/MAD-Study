package com.example.architecture_pattern_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.architecture_pattern_sample.bare.BareLoginActivity
import com.example.architecture_pattern_sample.databinding.ActivityMainBinding
import com.example.architecture_pattern_sample.mvc.controller.MvcLoginActivity
import com.example.architecture_pattern_sample.mvp.view.MvpLoginActivity
import com.example.architecture_pattern_sample.mvp.view.MvpLoginView

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBare.setOnClickListener{
            val intent = Intent(this, BareLoginActivity::class.java)  // 인텐트를 생성해줌,
            startActivity(intent)  // 화면 전환을 시켜줌
            finish()
        }
        binding.btnMvc.setOnClickListener{
            val intent = Intent(this, MvcLoginActivity::class.java)  // 인텐트를 생성해줌,
            startActivity(intent)  // 화면 전환을 시켜줌
            finish()
        }
        binding.btnMvp.setOnClickListener{
            val intent = Intent(this, MvpLoginActivity::class.java)  // 인텐트를 생성해줌,
            startActivity(intent)  // 화면 전환을 시켜줌
            finish()
        }

    }

}