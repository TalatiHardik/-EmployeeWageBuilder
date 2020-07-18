
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC6-Add_condition_of_working_hours");
		 final int IS_FULL_TIME = 1;
		 final int IS_PART_TIME = 2;
		 final int NUM_WORKING_DAYS = 20;
		 final int Max_Hrs_IN_Month = 100;
		 
		 float employeeHours = 0 , employeeRatePerHr=20;
		 float totalSalary=0;
		 float totalWorkingDays=0 , totalEmpHr=0 ;
	     
	     while(totalEmpHr < Max_Hrs_IN_Month &&  totalWorkingDays < NUM_WORKING_DAYS) {
	    	
	    	double empCheck = Math.floor(Math.random()*10) % 3;
	    	totalWorkingDays++;
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
	        totalEmpHr=totalEmpHr+employeeHours;
	        System.out.println("Day "+totalWorkingDays+" wage: "+(employeeHours*employeeRatePerHr));
	     }
	     totalSalary=totalEmpHr*employeeRatePerHr;
	     System.out.println("Total Salary of Employee is "+totalSalary);

	}

}
