// Student information class
class StudentInfo {

    String name;
    int rollNo;
    int marks;

    // Constructor
    StudentInfo(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate grade
    char getGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else if (marks >= 50)
            return 'E';
        else
            return 'F';
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println();
    }
}

// Main class
public class StudentRecord {

    public static void main(String[] args) {

        // Creating student objects
        StudentInfo student1 = new StudentInfo("Arun", 101, 92);
        StudentInfo student2 = new StudentInfo("Priya", 102, 78);

        // Displaying student details and grades
        student1.displayInfo();
        student2.displayInfo();
    }
}
