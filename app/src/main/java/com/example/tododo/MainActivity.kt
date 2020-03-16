package com.example.tododo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    login_button.setOnClickListener {

       intent = Intent(this,ToDoActivity::class.java)
       startActivity(intent)
    }
    }



}
