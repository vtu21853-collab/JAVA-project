import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Performance Tracker ---");
            System.out.println("1. Add Student");
            System.out.println("2. Enter Marks");
            System.out.println("3. View All Reports");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    sm.addStudent(id, name);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sm.enterMarks(sid, subject, marks);
                    break;

                case 3:
                    sm.viewAllReports();
                    break;

                case 4:
                    System.out.print("Enter ID to Remove: ");
                    int rid = sc.nextInt();
                    sm.removeStudent(rid);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
