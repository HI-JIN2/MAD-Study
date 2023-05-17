package com.example.architecture_pattern_sample.bare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.architecture_pattern_sample.R
import com.example.architecture_pattern_sample.databinding.ActivityBareLoginBinding

class BareLoginActivity : AppCompatActivity() {

    private val binding: ActivityBareLoginBinding by lazy {
        ActivityBareLoginBinding.inflate(layoutInflater)
    }

    var userName: String? = null
    var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.included.loginBtn.setOnClickListener {
            val isLoginSuccessful = login(
                binding.included.etUserName.text.toString(),
                binding.included.etPassword.text.toString()
            )

            if (isLoginSuccessful) {
                Toast.makeText(
                    this@BareLoginActivity, "$userName Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@BareLoginActivity, "Login Failed", Toast.LENGTH_SHORT).show()
            }

        }

    }

    fun login(userName: String?, password: String?): Boolean {
        if (userName == secretName && password == secretWord) {
            this.userName = userName
            this.password = password
            return true
        }
        return false
    }

    companion object {
        const val secretName = "user"
        const val secretWord = "1234"
    }
}