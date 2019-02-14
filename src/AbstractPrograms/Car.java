package AbstractPrograms;

public abstract class Car {
	public int wheels;
	public int mirrors;
	
	public abstract void start();
	
	{
		System.out.println("Car is starting");

	}
	
	public abstract void stop();
	
	{
		System.out.println("Car is stopping");

	}
	
	public  void reverse() {
		System.out.println("Car is reversing");
	}
}

