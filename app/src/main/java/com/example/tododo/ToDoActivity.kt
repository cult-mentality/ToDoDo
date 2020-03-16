package com.example.tododo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.todo_activity.*



class ToDoActivity : AppCompatActivity(),TodoContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.todo_activity)

        add_note.setOnClickListener {
            val todo_text= note.text.toString()
            val fragment = SavedNote.newInstance(todo_text)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.todo_list,fragment)
                .commit()
        }


    }
}
