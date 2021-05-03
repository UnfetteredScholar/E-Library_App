package com.example.e_libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import  android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



    }

    fun register(view: View)
    {
        val context= this

        val uname= findViewById<EditText>(R.id.username)
        val mail= findViewById<EditText>(R.id.email)
        val pass1= findViewById<EditText>(R.id.password1)
        val pass2= findViewById<EditText>(R.id.password2)

        if(uname.length() >0 && mail.length()>0 && pass1.length()>0 &&  pass2.length()>0)
        {
            if(pass1.getText().toString().compareTo( pass2.getText().toString()) ==0  )
            {
                var user = User(uname.text.toString(), mail.text.toString(), pass1.text.toString())
                var db= DatabaseHandler(context)
                val suc= db.insertData(user)

                if(suc==1)
                {
                    //MOVE TO LOGIN
                    val intent = Intent(this, LogIn::class.java)
                    startActivity(intent)
                }

            }
            else
            {
                Toast.makeText(context, "The Passwords Don't Match", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(context, "All Fields Are Required", Toast.LENGTH_SHORT).show()
        }
    }

}

