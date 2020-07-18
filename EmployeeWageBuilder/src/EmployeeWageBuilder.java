
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC5-Add working days per month");
		 final int IS_FULL_TIME = 1;
		 final int IS_PART_TIME = 2;
		 final int NUM_WORKING_DAYS = 20;
		 float employeeHours = 0 , totalSalary=0;
		 float employeeRatePerHr=20 , salary = 0;
	     
	     for(int day=1;day<NUM_WORKING_DAYS;day++) {
	    	 
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
	        totalSalary=totalSalary+salary;
	        
	     }
	        
	        System.out.println("Salary of Employee is "+totalSalary);

	}

}
