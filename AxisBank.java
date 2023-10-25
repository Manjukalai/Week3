package week3.day2.assign;

public class AxisBank extends BankInform { //connecting abstract class with normal class by extends keyword

	public void deposit()
	{
		System.out.println("need to be deposited on 22.11.2023");//body of deposit is changed to override the deposit method
	}
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();//override
		
		
			}

}
