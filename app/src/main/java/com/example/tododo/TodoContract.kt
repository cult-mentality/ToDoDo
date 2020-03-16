package com.example.tododo

interface TodoContract {
    interface View {
    }
    interface Presenter {
        fun ChangeText(text:String)
    }
}