
public class CompanyEmpWage {
	
	
	 
	 public final String companyName;
	 public final int employeeRatePerHr;
	 public final int numOfWorkingDays;
	 public final int maxHoursPerMonth;
	 public int totalEmpWage;
	 public String dailywage;
	 
	 public CompanyEmpWage(String companyName,int employeeRatePerHr,int numOfWorkingDays ,int maxHoursPerMonth) {
		 this.companyName=companyName;
		 this.employeeRatePerHr=employeeRatePerHr;
		 this.numOfWorkingDays=numOfWorkingDays;
		 this.maxHoursPerMonth=maxHoursPerMonth;
	 }
	 
	 public void setTotalEmpWage( String dailywage , String totalEmpWage) {
		 this.totalEmpWage=Integer.parseInt(totalEmpWage);
		 this.dailywage=dailywage;
	 }
	 
	 public String toString() {
		 return "Daily wage is : "+dailywage+"\nTotal Employee Wage for "+companyName+"  is "+totalEmpWage;
		 
	 }

}
