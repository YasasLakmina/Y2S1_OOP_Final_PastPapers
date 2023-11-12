package June2023_Q1_VersionB;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	private String courseId;
	private String courseName;
	private String instructor;
	ArrayList<Student> enrolledStudents = new ArrayList<Student>();
	
	public Course() {
		Read();
	}
	
	public Course(String courseId, String courseName, String instructor) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
	}
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Course ID :");
		this.courseId = sc.nextLine();
		
		System.out.print("Enter the Course Name :");
		this.courseName = sc.nextLine();
		
		System.out.print("Enter the Instructor :");
		this.instructor = sc.nextLine();
		
		System.out.println();
	}
	
	public void Print() {
		
		System.out.println("Course Information :");

		System.out.println("Course ID :" + this.courseId);
		System.out.println("Course Name :" + this.courseName);
		System.out.println("Course Instructor :" + this.instructor);
		
		System.out.println("Enrolled Students :");
		
		for(Student student : enrolledStudents) {
			
			System.out.println(student.getName());
		}
		
		System.out.println();
	}
	
	public void AddStudent(Student student) {

		enrolledStudents.add(student);
	}
	
	
}
