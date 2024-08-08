public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student model
        Student model = new Student("John Doe", 123, 85.0);

        // Create a student view
        StudentView view = new StudentView();

        // Create a student controller
        StudentController controller = new StudentController(model, view);

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade(90.0);

        // Display updated student details
        controller.updateView();
    }
}