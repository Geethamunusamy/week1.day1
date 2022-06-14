package week1day2;

/*
 * Create a new class as EmployeeDetails with methods as below
	printEmployeeName(String empName, int empId) -> print the empName & empId
	getEmployeeAddress(String empAddress) -> print address (eg: Chennai)
	printEmployeeSalary(double empSalary) -> print the empSalary
	printEmployeeMobileNumber(long mobNum) -> print the phoneNumber
	Call all the methods from main() and execute
 *
 */
public class EmployeeDetails
{
	void printEmployeeName(String empName, int empId)
	{
		System.out.println(empName + ", " + empId);
	}
	void printEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	void printEmployeeSalary(double empSalary)
	{
		System.out.println(empSalary);
	}
	void printEmployeeMobileNumber(long mobNum)
	{
		System.out.println(mobNum);
	}
	public static void main(String[] args)
	{
		EmployeeDetails employee = new EmployeeDetails();
		
		employee.printEmployeeName("Hari", 7);
		employee.printEmployeeAddress("Chennai");
		employee.printEmployeeSalary(123450.07);
		employee.printEmployeeMobileNumber(9940066054l);
	}
}