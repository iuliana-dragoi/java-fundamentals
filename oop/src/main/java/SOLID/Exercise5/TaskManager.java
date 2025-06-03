package main.java.SOLID.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private static TaskManager instance;
    private List<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    static TaskManager getInstance() {
        if(instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    // Add Task
    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    // Update status of a Task
    public void completeTask(int id) {
        for(Task task : this.taskList) {
            if(task.getId() == id) {
                task.setCompleted(true);
                break;
            }
        }
    }
}
