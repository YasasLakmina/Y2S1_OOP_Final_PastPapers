package June2023_Q1_VersionB;

public class StudentApp {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		
		Course course = new Course();
		Course course2 = new Course();
		
		course.AddStudent(student);
		course.AddStudent(student2);
		course2.AddStudent(student2);
		
		student.Print();
		student2.Print();
		course.Print();
		course2.Print();
	}
}
