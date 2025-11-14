import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public void enterMarks(int id, String subject, int marks) {
        Student s = searchStudent(id);
        if (s != null) {
            s.addMark(subject, marks);
            System.out.println("Marks added successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void viewAllReports() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.showReport();
        }
    }

    public void removeStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
