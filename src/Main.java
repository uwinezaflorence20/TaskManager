import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        List<String> arrayListTasks = new ArrayList<>();
        List<String> linkedListTasks = new LinkedList<>();

        // Add tasks
        try {
            manager.addTask(arrayListTasks, "Do laundry");
            manager.addTask(arrayListTasks, "Buy groceries");
            manager.addTask(arrayListTasks, "Finish homework");

            // Invalid: empty task
            manager.addTask(arrayListTasks, "");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: addTask");
        }

        // Sort tasks
        manager.sortTasks(arrayListTasks);
        System.out.println("Sorted tasks: " + arrayListTasks);

        // Search for a task
        int index = manager.searchTask(arrayListTasks, "Buy groceries");
        System.out.println(index >= 0 ? "Task found at index: " + index : "Task not found");

        // Remove task
        manager.removeTask(arrayListTasks, "Do laundry");

        // Remove non-existent task
        manager.removeTask(arrayListTasks, "Walk dog");

        // Find longest task
        String longest = manager.findLongestTask(arrayListTasks);
        System.out.println("Longest task: " + longest);

        // Get task at valid index
        String taskAtIndex = manager.getTask(arrayListTasks, 1);
        if (taskAtIndex != null) {
            System.out.println("Task at index 1: " + taskAtIndex);
        }

        // Get task at invalid index
        manager.getTask(arrayListTasks, 5);

        // Also test with LinkedList
        try {
            manager.addTask(linkedListTasks, "Attend meeting");
            manager.addTask(linkedListTasks, "Read book");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: addTask (LinkedList)");
        }

        System.out.println("LinkedList tasks: " + linkedListTasks);
    }
}
