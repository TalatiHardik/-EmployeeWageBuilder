
public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	 EmployeeWageBuilder(){
		 companyEmpWageArray = new CompanyEmpWage[5];
	 }
	 
	private void addCompangEmpWage(String companyName,int employeeRatePerHr,int numOfWorkingDays ,int maxHoursPerMonth) {
		
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName,employeeRatePerHr,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for (int i=0 ;i< numOfCompany;i++) {
			companyEmpWageArray[i].setTotalEmpWage( this.computeEmpWage(companyEmpWageArray[i]) );
			System.out.println(companyEmpWageArray[i]);
			
		}
		
	}
	 
	 
	 private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		 
		 int totalWorkingDays=0 , totalEmpHr=0  ,employeeHours=0;
		 System.out.println("Company: "+companyEmpWage.companyName);
		 System.out.println("Daily wages are: ");
		 while(totalEmpHr < companyEmpWage.maxHoursPerMonth &&  totalWorkingDays < companyEmpWage.numOfWorkingDays) {
		    	
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
		        System.out.println("Day "+totalWorkingDays+" \t wage: "+(employeeHours*companyEmpWage.employeeRatePerHr));
		     }
		 
		 		//companyEmpWage.totalEmpWage=totalEmpHr * companyEmpWage.employeeRatePerHr;
		     //System.out.println("Total Salary of "+companyName+" employee is "+totalEmpWage);
			return  totalEmpHr * companyEmpWage.employeeRatePerHr;
		    
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to UC10-Manage_Emp_Wage_of_multiCompanies");	 
		 EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
		 employeeWageBuilder.addCompangEmpWage("TCS", 23, 4, 12);
		 employeeWageBuilder.addCompangEmpWage("Wipro", 15, 4, 20);
		 employeeWageBuilder.computeEmpWage();
		

	}

}
