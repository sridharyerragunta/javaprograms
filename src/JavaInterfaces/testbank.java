package JavaInterfaces;

public class testbank {

	public static void main(String[] args) {
     Bank obj=null;
     
     String bankType="sbi";
     if(bankType.equalsIgnoreCase("icici"))
    	 obj=new icici();
     else if(bankType.equals("sbi"))
    	 obj=new sbi();
     else
    	 System.out.println("Invalid Type");
       obj.login();
       obj.logout();
       obj.balt();
     //(rbi(obj)).banklimit();
	}

}
