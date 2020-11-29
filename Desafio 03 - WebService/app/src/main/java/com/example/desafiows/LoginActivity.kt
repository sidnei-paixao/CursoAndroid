package com.example.desafiows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafiows.ui.login.LoginFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportFragmentManager.beginTransaction().replace(R.id.frmTela, LoginFragment()).commit()
    }
}