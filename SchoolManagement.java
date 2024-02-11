import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Teacher extends Person {
    private String department;

    public Teacher(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Course {
    private String courseName;
    private String teacherName;
    private ArrayList<Student> students;

    public Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

public class SchoolManagementSystem {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;

    public SchoolManagementSystem() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(Student student, Course course) {
        course.addStudent(student);
    }

    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding students
        sms.addStudent(new Student("John Doe", 101));
        sms.addStudent(new Student("Jane Smith", 102));

        // Adding teachers
        sms.addTeacher(new Teacher("Professor Johnson", "Mathematics"));
        sms.addTeacher(new Teacher("Professor Smith", "Physics"));

        // Adding courses
        sms.addCourse(new Course("Math101", "Professor Johnson"));
        sms.addCourse(new Course("Physics101", "Professor Smith"));

        // Enrolling students in courses
        sms.enrollStudentInCourse(sms.students.get(0), sms.courses.get(0));
        sms.enrollStudentInCourse(sms.students.get(1), sms.courses.get(1));

        // Displaying enrolled students in courses
        for (Course course : sms.courses) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Teacher: " + course.getTeacherName());
            System.out.println("Enrolled Students:");
            for (Student student : course.getStudents()) {
                System.out.println(student.getName() + " (ID: " + student.getId() + ")");
            }
            System.out.println();
        }
    }
}
