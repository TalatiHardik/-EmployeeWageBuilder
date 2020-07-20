
public class EmployeeWageBuilder {
	final static int IS_FULL_TIME = 1;
	 final static int IS_PART_TIME = 2;
	 final static int NUM_WORKING_DAYS = 20;
	 final static int Max_Hrs_IN_Month = 100;
	 
	 static float employeeHours = 0;
	
	 
	 
	 
	 public static float getWorkingHours(double empCheck){
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
		 
		 return employeeHours;
	 }
	 
	 public static void getSalary() {
		 float employeeRatePerHr=20;
		 float totalSalary=0;
		 float totalWorkingDays=0 , totalEmpHr=0 ;
		
		 
		 System.out.println("Daily wages are: ");
		 while(totalEmpHr < Max_Hrs_IN_Month &&  totalWorkingDays < NUM_WORKING_DAYS) {
		    	
		    	double empCheck = Math.floor(Math.random()*10) % 3;
		    	totalWorkingDays++;
		    	employeeHours=getWorkingHours(empCheck);
		        totalEmpHr=totalEmpHr+employeeHours;
		        System.out.println("Day "+totalWorkingDays+" \t wage: "+(employeeHours*employeeRatePerHr));
		     }
		 
		     totalSalary=totalEmpHr*employeeRatePerHr; 
		     System.out.println("Total Salary of Employee is "+totalSalary);
		   
	 }
	 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC7-Use_OOP_Concepts");	 
		 getSalary();
		 
	     

	}

}
