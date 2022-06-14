package week1day2;

/*
 *Create a class for TwoWheeler and declare below global variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.
 *
 */
public class TwoWheeler
{
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 123456789122l;
	boolean isPunctured = false;
	String bikeName = "royal enfiled" ;
	double runningKM = 123456.10;
	
	

	public static void main(String[] args)
	{
		TwoWheeler bike = new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);


	}
}