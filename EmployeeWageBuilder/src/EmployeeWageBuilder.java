
public class EmployeeWageBuilder {
	final int IS_FULL_TIME = 1;
	 final int IS_PART_TIME = 2;
	 
	 float employeeHours = 0 , employeeRatePerHr=20;
	 float totalSalary=0;
	 float totalWorkingDays=0 , totalEmpHr=0 ;
	 int numOfDays=0 , maxHrs=0;
	 String companyName=""; 
	 
	 EmployeeWageBuilder(String name , float employeeRatePerHr , int numOfDays , int maxHrs){
		 companyName=name;
		 this.employeeRatePerHr=employeeRatePerHr;
		 this.numOfDays=numOfDays;
		 this.maxHrs=maxHrs;
	 }
	 
	 EmployeeWageBuilder(){
		 companyName="";
		 
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
		 
		 if(companyName!="") {
			 System.out.println("Employee is from "+companyName);
		 }
		 System.out.println("Daily wages are: ");
		 while(totalEmpHr < maxHrs &&  totalWorkingDays < numOfDays) {
		    	
		    	double empCheck = Math.floor(Math.random()*10) % 3;
		    	totalWorkingDays++;
		    	employeeHours=getWorkingHours(empCheck);
		        totalEmpHr=totalEmpHr+employeeHours;
		        System.out.println("Day "+totalWorkingDays+" \t wage: "+(employeeHours*employeeRatePerHr));
		     }
		 
		     totalSalary=totalEmpHr*employeeRatePerHr;
		     
		     if(companyName!="") {
		    	 
		    	 System.out.println("Total Salary of "+companyName+" employee is "+totalSalary);
			 }
		     else{
		    	 
		    	 System.out.println("Total Salary of Employee is "+totalSalary);
		     }
	 }
	 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC8-Use_class_isntances");	 
		 EmployeeWageBuilder emp1 = new EmployeeWageBuilder("TCS",20,10,10);
		 emp1.getSalary();
		 EmployeeWageBuilder emp2 = new EmployeeWageBuilder("Wipro",22,9,12);
		 emp2.getSalary();
		 
	     

	}

}
