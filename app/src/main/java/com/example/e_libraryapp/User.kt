package com.example.e_libraryapp

class User
{
    var username: String= ""
    var email: String= ""
    var password1: String=""

    constructor(username:String, email:String, password:String)
    {
        this.username= username
        this.email= email
        this.password1= password
    }

    constructor(username:String, password:String)
    {
        this.username= username
        this.password1= password
        this.email= ""
    }


}