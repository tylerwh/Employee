package model;

public class EmpBusinessLogic {
	
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}
	
	public boolean isRetirementAge(Employee employee) {
		boolean isRetirementAge = true;
		
		if(employee.getAge() <= 65) {
			isRetirementAge = false;
		} else {
			isRetirementAge = true;
		}
		
		return isRetirementAge;
		
	}

}
