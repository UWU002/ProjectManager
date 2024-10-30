package com.example.projectmanager

class Task(
    var parentList: OList,
    var name: String,
    private var assignedTo: MutableList<Person>,
    var description: String,
    var taskStart: String,
    var taskExpectedFinish: String,
    var taskFinishDate: String,
    private var subTasks: MutableList<SubTask>
) {
    fun addPerson(person: Person) {
        assignedTo.add(person)
    }

    fun removePerson(person: Person) {
        assignedTo.remove(person)
    }

    fun addSubTask(subTask: SubTask) {
        subTasks.add(subTask)
    }

    fun removeSubTask(subTask: SubTask) {
        subTasks.remove(subTask)
    }

    fun  deleteTask(){
        subTasks.clear()
        parentList.removeTask(this)
    }

    fun changeParentList(newList: OList){
        newList.addTask(this)
        parentList.removeTask(this)
        parentList= newList
    }

}