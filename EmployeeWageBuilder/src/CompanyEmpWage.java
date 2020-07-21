
public class CompanyEmpWage {
	
	
	 
	 public final String companyName;
	 public final int employeeRatePerHr;
	 public final int numOfWorkingDays;
	 public final int maxHoursPerMonth;
	 public int totalEmpWage;
	 
	 public CompanyEmpWage(String companyName,int employeeRatePerHr,int numOfWorkingDays ,int maxHoursPerMonth) {
		 this.companyName=companyName;
		 this.employeeRatePerHr=employeeRatePerHr;
		 this.numOfWorkingDays=numOfWorkingDays;
		 this.maxHoursPerMonth=maxHoursPerMonth;
	 }
	 
	 public void setTotalEmpWage(int totalEmpWage) {
		 this.totalEmpWage=totalEmpWage;
		 
	 }
	 
	 public String toString() {
		 return "Total Employee Wage for "+companyName+"  is "+totalEmpWage;
		 
	 }

}
