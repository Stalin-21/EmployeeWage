package com.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        System.out.println("Computing wages for multiple companies:\n");

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("TCS", 20, 8, 4, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 8, 4, 22, 110);
        empWageBuilder.computeEmpWage();
        System.out.println("Queried Wage for TCS: " + empWageBuilder.getTotalWageByCompany("TCS"));
    }
}
