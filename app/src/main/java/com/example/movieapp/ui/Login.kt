package com.example.movieapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.movieapp.R
import com.example.movieapp.ui.latestmovie.PopularMovies
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin.setOnClickListener {
            if (editTextUsername.text.toString().equals("Amanda") && editTextPwd.text.toString().equals("1234")) {
                val intent = Intent(this, PopularMovies::class.java)
                startActivity(intent)
                Toast.makeText(this, "Successfully logged in", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login failed", Toast.LENGTH_LONG).show()
            }
        }
    }
}
