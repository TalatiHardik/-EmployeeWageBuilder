import java.util.*;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private LinkedList<CompanyEmpWage> CompanyEmpWageList;
	private Map<String,CompanyEmpWage> CompanyToEmpWageMap;
	
	 EmployeeWageBuilder(){
		 CompanyEmpWageList = new LinkedList<>();
		 CompanyToEmpWageMap = new HashMap<>();
	 }
	 
	private void addCompangEmpWage(String companyName,int employeeRatePerHr,int numOfWorkingDays ,int maxHoursPerMonth) {
		
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName,employeeRatePerHr,numOfWorkingDays,maxHoursPerMonth);
		CompanyEmpWageList.add(companyEmpWage);
		CompanyToEmpWageMap.put(companyName, companyEmpWage);
	}
	
	private void computeEmpWage() {
		for (int i=0 ;i< CompanyEmpWageList.size();i++) {
			CompanyEmpWage companyEmpWage = CompanyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage( this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
			
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
		System.out.println("Welcome to UC11-Refactor_to_use_list");	 
		 EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
		 employeeWageBuilder.addCompangEmpWage("TCS", 23, 4, 12);
		 employeeWageBuilder.addCompangEmpWage("Wipro", 15, 4, 20);
		 employeeWageBuilder.computeEmpWage();
		

	}

}
