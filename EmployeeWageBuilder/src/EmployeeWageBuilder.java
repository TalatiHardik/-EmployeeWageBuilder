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
			String[] wage = this.computeEmpWage(companyEmpWage);
			companyEmpWage.setTotalEmpWage( wage[0] , wage[1] );
			System.out.println(companyEmpWage);
			
		}
		
	}
	 
	 
	 private String[] computeEmpWage(CompanyEmpWage companyEmpWage) {
		 
		 int totalWorkingDays=0 , totalEmpHr=0  ,employeeHours=0;
		 String dailywage="",tempwage="";
		 System.out.println("Company: "+companyEmpWage.companyName);
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
		        tempwage="Day "+totalWorkingDays+" \t wage: "+(employeeHours*companyEmpWage.employeeRatePerHr);
		        dailywage=dailywage+"\n"+tempwage;
		       // System.out.println(tempwage);
		     }
		 String [] wage = new String[2];
		 wage[0] = dailywage;
		 wage[1] = Integer.toString(totalEmpHr * companyEmpWage.employeeRatePerHr);
		 return wage ;
			
		    
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
