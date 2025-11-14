import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private HashMap<String, Integer> marks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.marks = new HashMap<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void addMark(String subject, int mark) {
        marks.put(subject, mark);
    }

    public int calculateTotal() {
        int total = 0;
        for (int m : marks.values()) {
            total += m;
        }
        return total;
    }

    public double calculateAverage() {
        if (marks.size() == 0) return 0;
        return calculateTotal() / (double) marks.size();
    }

    public String getGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public void showReport() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
        System.out.println("--------------------------------");
    }
}
