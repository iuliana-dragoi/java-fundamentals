package main.java.SOLID.Exercise5;

public class Task {

    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class TaskBuilder {

        private int id;
        private String title;
        private String description;

        public TaskBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public TaskBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public TaskBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Task build() {
            return new Task(id, title, description);
        }
    }
}
