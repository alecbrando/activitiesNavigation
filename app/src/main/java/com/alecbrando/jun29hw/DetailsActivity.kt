package com.alecbrando.jun29hw

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class DetailsActivity : AppCompatActivity() {

    internal lateinit var firstNameField : TextView
    internal lateinit var surnameField : TextView
    internal lateinit var emailField : TextView
    internal lateinit var passwordField : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val firstName : String? = intent.getStringExtra(Constant.FIRST_NAME)
        val surname : String? = intent.getStringExtra(Constant.SUR_NAME)
        val email : String? = intent.getStringExtra(Constant.EMAIL)
        val password : String? = intent.getStringExtra(Constant.PASSWORD)

        firstNameField = findViewById(R.id.nameField)
        surnameField = findViewById(R.id.surField)
        emailField = findViewById(R.id.emailField)
        passwordField = findViewById(R.id.passwordField)


        firstNameField.setText(firstName)
        surnameField.setText(surname)
        emailField.setText(email)
        passwordField.setText(password)
    }
}