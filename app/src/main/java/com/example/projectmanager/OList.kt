package com.example.projectmanager

class OList (
    var name: String,
    private var tasks: MutableList<Task>){

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun removeTask(task: Task) {
        tasks.remove(task)
    }
}