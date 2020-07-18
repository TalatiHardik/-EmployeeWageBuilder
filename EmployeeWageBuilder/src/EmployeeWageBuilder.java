
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC2-Caculate daily wage");
		 int IS_FULL_TIME = 1;
		 float employeeHours = 8;
		 float employeeRatePerHr=20 , salary = 0;
	        double empCheck = Math.floor(Math.random()*10) % 2;
	        if(empCheck == IS_FULL_TIME) {
	        	salary=employeeHours*employeeRatePerHr;
	        }
	        System.out.println("Salary of Employee is "+salary);

	}

}
