package main.java.Examples.TaskScheduler;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.scheduleTask(new Task("Write Report", LocalDate.of(2023, 4, 15)));
        scheduler.scheduleTask(new Task("Pay Bills", LocalDate.of(2023, 4, 10)));

        System.out.println(scheduler.getNextTask());
    }

    public static class Task implements Comparable<Task> {
        private String title;
        private LocalDate dueDate;

        public Task(String title, LocalDate dueDate) {
            this.title = title;
            this.dueDate = dueDate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Task)) return false;
            Task o = (Task) obj;
            return Objects.equals(this.getTitle(), o.getTitle()) &&
                    Objects.equals(this.getDueDate(), o.getDueDate());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getTitle(), getDueDate());
        }

        @Override
        public int compareTo(Task o) {
            return this.getDueDate().compareTo(o.getDueDate());
        }

        @Override
        public String toString() {
            return this.getTitle() + " " + this.getDueDate();
        }
    }

    // --- TaskScheduler class ---
    public static class TaskScheduler {
        private TreeMap<Task, LocalDate> map;

        public TaskScheduler() {
            map = new TreeMap<>();
        }

        public void scheduleTask(Task task) {
            map.put(task, task.getDueDate());
        }

        public Task getNextTask() {
            Map.Entry<Task, LocalDate> entry = map.firstEntry();
            if (entry != null) {
                return entry.getKey();
            } else {
                System.out.println("No tasks scheduled.");
                return null;
            }
        }
    }
}