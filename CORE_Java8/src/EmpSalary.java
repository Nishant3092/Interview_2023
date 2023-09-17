import java.util.Scanner;

public class EmpSalary {

	public static void main(String[] args) {
		
		/*float basic_salary,da,hra,da1,hra1,GrossPayment;

		  Scanner scan=new Scanner(System.in);

		  System.out.println("Enter Basic Salary Of Employee: ");
		  basic_salary=scan.nextFloat();

		  System.out.println("Enter Basic DA Of Employee: "); 
		  da1=scan.nextFloat();
		 
		  System.out.println("Enter Basic HRA Of Employee: ");
		  hra1=scan.nextFloat();

		  da = (da1 * basic_salary) / 100;
		  hra = (hra1 * basic_salary) / 100;

		  GrossPayment = basic_salary + da + hra;

		  System.out.println("Gross Salary Of Employee: "+GrossPayment);
*/
		
		
		
		double basic,da,hra,gross;
		System.out.println("Enter Basic salary of the employee\n");
		Scanner obj1=new Scanner(System.in);
		basic=obj1.nextDouble();
		da=40*basic/100;
		hra=20*basic/100;
		gross= basic+da+hra;
		System.out.println("The D.A of the basic salary of the employee is:" +da);
		System.out.println("The H.R.A of the basic salary of the employee is:" +hra);
		System.out.println("The Gross salary of the employee is:" +gross);
	}

}
