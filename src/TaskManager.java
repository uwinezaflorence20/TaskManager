import java.util.*;

public class TaskManager {

    public void addTask(List<String> tasks, String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Invalid task! Task cannot be empty.");
        }
        tasks.add(task);
    }

    public void sortTasks(List<String> tasks) {
        Collections.sort(tasks);
    }

    public int searchTask(List<String> tasks, String target) {
        return tasks.indexOf(target);
    }

    public void removeTask(List<String> tasks, String task) {
        if (!tasks.remove(task)) {
            System.out.println("Error: Task not found!");
        } else {
            System.out.println("Task '" + task + "' removed successfully.");
        }
    }

    public String findLongestTask(List<String> tasks) {
        if (tasks.isEmpty()) return null;

        String longest = tasks.get(0);
        for (String task : tasks) {
            if (task.length() > longest.length()) {
                longest = task;
            }
        }
        return longest;
    }

    public String getTask(List<String> tasks, int index) {
        try {
            return tasks.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds!");
            return null;
        }
    }
}
