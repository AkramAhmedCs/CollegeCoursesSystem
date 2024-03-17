import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private  String name;
    private int number;

    ArrayList<Courses>enrolledCourses=new ArrayList<>(6);
    Courses course1=new Courses("Programming",3,1,"Dr Christine");
    Courses course2=new Courses("Advanced Calculus",3,2,"Dr Mohamed Walid");
    Courses course3=new Courses("Discrete Mathematics",3,3,"Dr Emad");
    Courses course4=new Courses("Intro to data science",3,4,"Dr Magda");
    Courses course5=new Courses("Intro to AI",3,5,"Dr Tamer");
    Courses course6=new Courses("innovation",3,6,"Dr");
    Courses course7=new Courses("Calculus",3,7,"Dr Abdel Latif");
    final ArrayList<Courses> courseList = new ArrayList<>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7));

    public Student(String name, int number) {
        this.name = name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Courses> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<Courses> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    public void showCourses(){
        System.out.println("These are the courses available for you to choose from");
        for (Courses course:courseList){
            System.out.println(course);
        }
    }
    public void bookCourses(){
        Scanner scanner= new Scanner(System.in);
        int i=1;
        while (i<=6){
            System.out.println("Choose the course id you want to add");
            int id= scanner.nextInt();
            if (id==1)
                enrolledCourses.add(course1);
            else if (id==2) {enrolledCourses.add(course2);

            }
            else if (id==3) {enrolledCourses.add(course3);

            }
            else if (id==4) {enrolledCourses.add(course4);

            }
            else if (id==5) {enrolledCourses.add(course5);

            }
            else if (id==6) {enrolledCourses.add(course6);

            }
            else if (id==7) {enrolledCourses.add(course7);

            }else System.out.println("enter a valid Course id from 1==>7");
i+=1;

        }

    }


    public void showEnrolledCoursesAndStudentInfo() {
        System.out.println("Dear " + name + ","); // Added comma
        System.out.println("This is your info and your courses of will:"); // Reworded slightly
        System.out.println("Number: " + number);
        System.out.println("Enrolled Courses:");

        if (enrolledCourses.isEmpty()) {
            System.out.println("You have not enrolled in any courses yet.");
        } else {
            for (Courses course : enrolledCourses) {
                System.out.println(course.toString());
            }
        }
    }


}
