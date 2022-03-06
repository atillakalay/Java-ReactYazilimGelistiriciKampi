package kodlamaioHomeWork;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		studentManager.courseList();

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseList();
		instructorManager.courseAdd();
	}

}
