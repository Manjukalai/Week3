package week3.day1.assgn;

public class DesktopInher extends ComputerInher{
	public void desktopSize()
	{
		System.out.println("Size of desktop");
	}

	public static void main(String[] args) {
		DesktopInher obj = new DesktopInher();
		obj.computerModel();
		obj.desktopSize();
		
	}

}
