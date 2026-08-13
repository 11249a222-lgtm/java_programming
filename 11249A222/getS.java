import java.util.Scanner;

interface Academic {
    void getAcademicMarks();
}

interface Sports {
    void getSportsMarks();
}

class Student implements Academic, Sports {
    String name;
    int academicMarks;
    int sportsMarks;

    public void getAcademicMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Academic Marks: ");
        academicMarks = sc.nextInt();
    }

    public void getSportsMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sports Marks: ");
        sportsMarks = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Academic Marks: " + academicMarks);
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + (academicMarks + sportsMarks));
    }
}

public class getS{
    public static void main(String[] args) {
        Student s = new Student();

        s.getAcademicMarks();
        s.getSportsMarks();
        s.display();
    }
}