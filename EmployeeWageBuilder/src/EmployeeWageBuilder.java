
public class EmployeeWageBuilder {
	final int IS_FULL_TIME = 1;
	 final int IS_PART_TIME = 2;
	 final int NUM_WORKING_DAYS = 20;
	 final int Max_Hrs_IN_Month = 100;
	 
	 float employeeHours = 0 , employeeRatePerHr=20;
	 float totalSalary=0;
	 float totalWorkingDays=0 , totalEmpHr=0 ;
	 String employeeName=""; 
	 
	 EmployeeWageBuilder(String name){
		 employeeName=name;
		 
	 }
	 
	 EmployeeWageBuilder(){
		 employeeName="";
		 
	 }
	 
	 public float getWorkingHours(double empCheck){
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
	 
	 public void getSalary() {
		 
		 if(employeeName!="") {
			 System.out.println("Employee name is "+employeeName);
		 }
		 System.out.println("Daily wages are: ");
		 while(totalEmpHr < Max_Hrs_IN_Month &&  totalWorkingDays < NUM_WORKING_DAYS) {
		    	
		    	double empCheck = Math.floor(Math.random()*10) % 3;
		    	totalWorkingDays++;
		    	employeeHours=getWorkingHours(empCheck);
		        totalEmpHr=totalEmpHr+employeeHours;
		        System.out.println("Day "+totalWorkingDays+" \t wage: "+(employeeHours*employeeRatePerHr));
		     }
		 
		     totalSalary=totalEmpHr*employeeRatePerHr;
		     
		     if(employeeName!="") {
		    	 
		    	 System.out.println("Total Salary of "+employeeName+" is "+totalSalary);
			 }
		     else{
		    	 
		    	 System.out.println("Total Salary of Employee is "+totalSalary);
		     }
	 }
	 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC7-Use_OOP_Concepts");	 
		 EmployeeWageBuilder emp1 = new EmployeeWageBuilder("Mukesh");
		 emp1.getSalary();
		 
	     

	}

}
