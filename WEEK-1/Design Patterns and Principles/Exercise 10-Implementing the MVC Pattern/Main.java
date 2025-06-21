public class Main {
    public static void main(String[] args) {
        // Create model object
        Student student = new Student("SINDHU.T", "ST1024", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        // Update model data via controller
        controller.setStudentName("SINDHU T");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}
