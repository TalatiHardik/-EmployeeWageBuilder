
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC1-Employee Check");
		 final int IS_FULL_TIME = 1;
		 final int IS_PART_TIME = 2;
		 float employeeHours = 0;
		 float employeeRatePerHr=20 , salary = 0;
	        double empCheck = Math.floor(Math.random()*10) % 3;
	        switch((int)empCheck) {
	        case IS_FULL_TIME:
	        	employeeHours = 8;
	        	break;
	        
	        case IS_PART_TIME:
	        	employeeHours = 4;
	        	break;
	        	
	        default:
	        	employeeHours = 0;
	        	break;
	        }
	        salary=employeeHours*employeeRatePerHr;
	        System.out.println("Salary of Employee is "+salary);

	}

}
