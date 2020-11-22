package com.example.todolistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.todo_list.view.*

class TodoClass (
    private val todolist: MutableList<Todo>
) : RecyclerView.Adapter<TodoClass.TodoViewHolder>(){

    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.todo_list,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return todolist.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        var currentTodo = todolist[position]
        holder.itemView.apply {
            todoView

        }
    }
}