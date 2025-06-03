package main.java.SOLID.Exercise5;

public class Main {

    public static void main(String[] args) {
        TaskManager manager = TaskManager.getInstance();

        Task task = new Task.TaskBuilder().setId(1).setDescription("Description").setTitle("Title").build();
        manager.addTask(task);

        manager.completeTask(task.getId());
    }
}
