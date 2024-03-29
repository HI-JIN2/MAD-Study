package com.example.architecture_pattern_sample.mvvm.model

data class User( //data class의 장점?
    var userName: String? = null,
    var password: String? = null
) {
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