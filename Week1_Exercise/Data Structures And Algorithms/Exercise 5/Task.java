class Task {
    private int id;
    private String name;
    private boolean isComplete;

    public Task(int id, String name, boolean isComplete) {
        this.id = id;
        this.name = name;
        this.isComplete = isComplete;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Name: " + name + ", Complete: " + isComplete;
    }
}

class TaskLinkedList {
    private Node head;

    private class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Add a new task to the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Find a task by its ID
    public Task findTaskById(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.getId() == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Print all tasks in the list
    public void displayTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Remove a task by its ID
    public void removeTaskById(int id) {
        if (head == null) {
            return;
        }
        if (head.task.getId() == id) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.task.getId() == id) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks to the list
        taskList.addTask(new Task(1, "Complete homework", true));
        taskList.addTask(new Task(2, "Buy groceries", false));
        taskList.addTask(new Task(3, "Read a book", true));

        // Display all tasks
        System.out.println("All tasks:");
        taskList.displayTasks();

        // Search for a specific task
        Task task = taskList.findTaskById(2);
        if (task != null) {
            System.out.println("Found task: " + task.getName());
        } else {
            System.out.println("Task not found.");
        }

        // Remove a task
        taskList.removeTaskById(2);

        // Display all tasks after deletion
        System.out.println("Tasks after deletion:");
        taskList.displayTasks();
    }
}
