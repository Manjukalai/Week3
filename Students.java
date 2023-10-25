package week3.day2.assign;

public class Students implements InterfaceSample {
	//All unimpliment methods should be implemented
	//method overload by passing arg in same method
	public void getStudentInfo()
	{
		System.out.println("Information of students");
	}
	public void getStudentInfo(String name,int id)
	{
		System.out.println(name+" "+id);
		
	}
	public void getStudentInfo(int rollNo,int id)
	{
		System.out.println(rollNo+" "+id);
		
	}
	public void getStudentId() {
System.out.println("stu id");		
	}
	public void getStudentClass() {
System.out.println("class name");		
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Students s = new Students();
		
s.getStudentClass();
s.getStudentId();
s.getStudentInfo();
s.getStudentInfo(5236, 12);
s.getStudentInfo(12,"xxxxxxx");
s.getStudentInfo("xxxxxx", 10);

	}
}