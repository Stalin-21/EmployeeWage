package com.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        System.out.println("Computing wages for multiple companies:\n");

        EmpWageBuilder wageBuilder = new EmpWageBuilder();
        wageBuilder.addCompany("TCS", 20, 8, 4, 20, 100);
        wageBuilder.addCompany("Infosys", 22, 8, 4, 22, 120);
        wageBuilder.addCompany("Wipro", 18, 9, 5, 25, 110);

        wageBuilder.computeWages(); // compute for all
    }
}
