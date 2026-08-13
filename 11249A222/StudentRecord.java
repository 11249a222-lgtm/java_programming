class Student {
    // Fields
    String studentName;
    int rollNumber;
    int marks;

    // Constructor
    Student(String studentName, int rollNumber, int marks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println();
    }

    // Method to calculate grade
    char calculateGrade() {
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
}

// Main class
public class StudentRecord {
    public static void main(String[] args) {

        // Creating student objects
        Student student1 = new Student("Arun", 101, 92);
        Student student2 = new Student("Priya", 102, 78);

        // Displaying student details and grades
        student1.displayInfo();
        student2.displayInfo();
    }
}
