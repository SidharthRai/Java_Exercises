import java.util.Scanner;

public class EmployeeInformation {

	public static void main(String[] args) {
		
		int [] EmpNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		String [] EmpName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
		String [] JoinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
		char [] DesignationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		String [] Department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		int [] Basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int [] HRA = { 8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int [] IT = { 3000, 9000, 1000, 2000, 20000, 4400, 10000};
		
		int Salary = 0;
		String Designation = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Emp No.: ");
		int eno = sc.nextInt();
		eno = eno-1001;
		
		if (eno<0 || eno>= 7) {
			System.out.println("There is no employee with empid : "+ (eno+1001));
			System.exit(0);
		}
		
		switch (DesignationCode[eno]) {
		case 'e':
			Salary += 20000; //DA
			Designation = "Engineer";
			break;
		case 'c':
			Salary += 32000;
			Designation = "Consultant";
			break;
		case 'k':
			Salary += 12000;
			Designation = "Clerk";
			break;
		case 'r':
			Salary += 15000;
			Designation = "Receptionist";
			break;
		case 'm':
			Salary += 40000;
			Designation = "Manager";
			break;
		}
		
		Salary = Basic[eno]+HRA[eno]-IT[eno];
		
		//Output
		System.out.println("Emp No.: "+ EmpNo[eno]);
		System.out.println("Emp Name: "+ EmpName[eno]);
		System.out.println("Department: "+ Department[eno]);
		System.out.println("Designation: "+ Designation);
		System.out.println("Salary: "+ Salary);
		
	}

}
