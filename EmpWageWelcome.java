package practiceDay4;

public class EmpWageWelcome {


	String EmpName="Swapnil Kadam";
	int sal;
	String Department= "Account";
	
	public void Sal()
	{
		System.out.println("Salary=50,000" + sal);
	}
	public void Department()
	{
		System.out.println("Your Department = " + Department );
	}
	
	
	public static void main(String[] args) 
	{
		EmpWageWelcome emp=new EmpWageWelcome();
		System.out.println("Hello... "+ emp.EmpName + " Welcome to Employee Wage Computation Program.");
		emp.Department();
		emp.Sal();
	}

}
