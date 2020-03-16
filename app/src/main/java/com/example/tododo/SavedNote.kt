package com.example.tododo

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.FrameLayout
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import kotlinx.android.synthetic.main.fragment_saved_note.*
import kotlinx.android.synthetic.main.fragment_saved_note.view.*
import kotlinx.android.synthetic.main.todo_activity.*


private const val ARG_PARAM1 = "todoNote"


class SavedNote :ListFragment() {
    lateinit var adapter:ArrayAdapter<String>
    private lateinit var todoNote: String
    var Data=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            todoNote = it.getString(ARG_PARAM1).toString()
            Data.add(todoNote)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_saved_note, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = ArrayAdapter<String>(requireContext(),R.layout.fragment_saved_note,Data)
        listAdapter=adapter
    }


    companion object {
        fun newInstance(todoNote: String) =
            SavedNote().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, todoNote)
                }
            }
    }
}
