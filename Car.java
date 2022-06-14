package week1day2;

public class Car
{
	void applyBreak()
	{
		System.out.println("Break!");
	}
	
	void applyGear()
	{
		System.out.println("Gear!");
	}
	
	void switchOnAc()
	{
		System.out.println("AC!");
	}
	
	void applyAcclerate()
	{
		System.out.println("Acceleration!");
	}
	
	public static void main(String[] args)
	{
		Car car = new Car();
		car.applyBreak();
		car.applyGear();
		car.switchOnAc();
		car.applyAcclerate();
	}
}