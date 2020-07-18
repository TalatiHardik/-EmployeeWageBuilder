
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC1-Employee Check");
		 int IS_FULL_TIME = 1;
		 int IS_PART_TIME = 2;
		 float employeeHours = 0;
		 float employeeRatePerHr=20 , salary = 0;
	        double empCheck = Math.floor(Math.random()*10) % 3;
	        if(empCheck == IS_FULL_TIME) {
	        	employeeHours = 8;
	        }
	        else if(empCheck == IS_PART_TIME) {
	        	
	        	employeeHours = 4;
	        }
	        salary=employeeHours*employeeRatePerHr;
	        System.out.println("Salary of Employee is "+salary);

	}

}
