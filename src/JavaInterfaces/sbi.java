package JavaInterfaces;

public class sbi implements Bank, rbi {

	@Override
	public void banklimit() {
 System.out.println(limit);		
	}

	@Override
	public void login() {
System.out.println("sbi login");		
	}

	@Override
	public void logout() {
System.out.println("sbi logout");		
	}

	@Override
	public void balt() {
System.out.println(min_bal);		
	}

}
