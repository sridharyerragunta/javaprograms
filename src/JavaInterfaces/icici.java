package JavaInterfaces;

public class icici implements Bank, rbi {

	@Override
	public void banklimit() {
  System.out.println(limit);		
	}

	@Override
	public void login() {
    System.out.println("icici login");		
	}

	@Override
	public void logout() {
System.out.println("icici logout");		
	}

	@Override
	public void balt() {
System.out.println(min_bal);		
	}
	public void display(){
		System.out.println("icici balnce display");
	}

}
