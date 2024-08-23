import java.util.ArrayList;

public class TaskList {
    private Task[] tasklist;
    private int numberOfTask;

    public TaskList() {
        this.tasklist = new Task[100];
        this.numberOfTask = 0;
    }

    public void addTask(Task task) {
        this.tasklist[numberOfTask] = task;
        numberOfTask++;
        System.out.println("added: " + task + "\n"
                + "You have " + numberOfTask + " tasks in the list");

    }

    public void listTask() {
        for (int i = 0; i < numberOfTask; i++) {
            System.out.println((i + 1) + ". " + tasklist[i]);
        }
    }

    public void markTask(int index) {
        this.tasklist[index - 1].complete();
        System.out.println("Marked as done: \n" + this.tasklist[index - 1]);
    }

    public void unmarkTask(int index) {
        this.tasklist[index - 1].uncomplete();
        System.out.println("Marked as undone: \n" + this.tasklist[index - 1]);
    }
}