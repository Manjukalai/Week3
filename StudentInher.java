package week3.day1.assgn;

public class StudentInher extends DepartmentInher {
	public void studentName()
	{
		System.out.println("Name of the student");
	}
	public void studentDept()
	{
		System.out.println("Student dept");
		
	}
	public void studentId()
	{
		System.out.println("Student id");
	}
 

	public static void main(String[] args) {
		StudentInher object = new StudentInher();
		object.studentDept();
		object.studentId();
		object.studentName();
		object.collegeCode();
		object.collegeName();
		object.collegeRank();
		object.deptName();
		
		

	}

}
