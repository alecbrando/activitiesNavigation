package com.alecbrando.jun29hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.get
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var nextButton : Button
    private lateinit var firstName: TextInputLayout
    private lateinit var surname: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextButton = findViewById(R.id.containedButton)
        firstName = findViewById(R.id.firstName)
        surname = findViewById(R.id.surname)
        nextButton.setOnClickListener { view ->
            var name: String
            var sur: String
            name = firstName.editText?.text.toString()
            sur = surname.editText?.text.toString()
            val navigationIntent = Intent(this, EmailActivity::class.java).apply {
                putExtra(Constant.FIRST_NAME, name)
                putExtra(Constant.SUR_NAME, sur)
            }
            startActivity(navigationIntent)
        }
    }
}