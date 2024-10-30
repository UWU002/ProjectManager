package com.example.projectmanager


class SubTask (
    var parentTask: Task,
    var name: String,
    private var assignedTo: MutableList<Person>,
    var description: String,
    var taskStart: String,
    var taskExpectedFinish: String,
    var taskFinishDate: String,
    private var subTasks: MutableList<SubTask>
){
}