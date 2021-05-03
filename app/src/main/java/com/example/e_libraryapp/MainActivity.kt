package com.example.e_libraryapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun moveToSignUp(view: View) {
       // val rButton= findViewById<Button>(R.id.sign_up) as Button

        val intent = Intent(this, SignUp::class.java)

        startActivity(intent)
    }

    fun moveToLogIn(view: View) {
        //val rButton= findViewById<Button>(R.id.log_in) as Button

        val intent = Intent(this, LogIn::class.java)

        startActivity(intent)
    }





}