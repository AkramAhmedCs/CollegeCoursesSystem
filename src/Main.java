import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to FCDS, Please enter your name and phone number to continue");
        String name= scanner.nextLine();
        int number= scanner.nextInt();
        Student student1= new Student(name,number);
student1.showCourses();
student1.bookCourses();
student1.showEnrolledCoursesAndStudentInfo();    }
}

