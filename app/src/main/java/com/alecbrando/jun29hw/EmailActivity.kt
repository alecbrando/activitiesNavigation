package com.alecbrando.jun29hw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class EmailActivity : AppCompatActivity() {
    private lateinit var email : TextInputLayout
    private lateinit var nextButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)
        val firstName = intent.getStringExtra(Constant.FIRST_NAME)
        val surname = intent.getStringExtra(Constant.SUR_NAME)
        email = findViewById(R.id.email)
        nextButton = findViewById(R.id.button2)
        nextButton.setOnClickListener { view ->
            var emailText : String
            emailText = email.editText?.text.toString()
            val navigationIntent = Intent(this, PasswordActivity::class.java).apply {
                putExtra(Constant.EMAIL, emailText)
                putExtra(Constant.FIRST_NAME, firstName)
                putExtra(Constant.SUR_NAME, surname)
            }
            startActivity(navigationIntent)
        }
    }
}