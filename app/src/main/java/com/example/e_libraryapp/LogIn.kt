package com.example.e_libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }

    fun login(view: View)
    {
        val context= this
        val uname= findViewById<EditText>(R.id.username)
        val pass= findViewById<EditText>(R.id.password1)

        if(uname.length() >0 && pass.length() >0 )
        {
           val user= User(uname.text.toString(), pass.text.toString())

            val db= DatabaseHandler(context)

            val suc= db.readData(user)

            if(suc==1)
            {
                //MOVE TO WELCOME PAGE
                val intent = Intent(this, WelcomePage::class.java)
                startActivity(intent)
            }


        }
        else
        {
            Toast.makeText(context, "All Fields Are Required", Toast.LENGTH_SHORT).show()
        }

    }

}