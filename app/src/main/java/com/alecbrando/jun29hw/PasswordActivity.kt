package com.alecbrando.jun29hw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class PasswordActivity: AppCompatActivity() {

    private lateinit var password : TextInputLayout
    private lateinit var nextButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        val email = intent.getStringExtra(Constant.EMAIL)
        val firstName = intent.getStringExtra(Constant.FIRST_NAME)
        val surname = intent.getStringExtra(Constant.SUR_NAME)

        password = findViewById(R.id.password)
        nextButton = findViewById(R.id.button3)
        nextButton.setOnClickListener{ view ->
            val password = password.editText?.text.toString()
            val navigationIntent = Intent(this, DetailsActivity::class.java).apply {
                putExtra(Constant.FIRST_NAME, firstName)
                putExtra(Constant.SUR_NAME, surname)
                putExtra(Constant.EMAIL, email)
                putExtra(Constant.PASSWORD, password)
            }
            startActivity(navigationIntent)
        }



    }
}