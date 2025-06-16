package com.employeewage;


import java.util.ArrayList;
import java.util.Random;

class EmpWageBuilder implements IComputeEmpWage{

    // UC 12: Refactor to manage Employee Wage for multiple companies using a list
    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private Random random = new Random();

    public void addCompanyEmpWage(String name, int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
        companyList.add(new CompanyEmpWage(name, wagePerHour, fullDayHour, partTimeHour, maxWorkingDays, maxWorkingHours));
    }

    public void computeEmpWage() {
        for (CompanyEmpWage company : companyList) {
            int totalWage = computeWageForCompany(company);
            company.setTotalWage(totalWage);
            System.out.println(company); // uses toString()
        }
    }

    public int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage company : companyList) {
            if (company.companyName.equalsIgnoreCase(companyName)) {
                return company.totalWage;
            }
        }
        System.out.println("Company not found: " + companyName);
        return -1;
    }


    private int computeWageForCompany(CompanyEmpWage company) {
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        System.out.println("Calculating wages for " + company.companyName);

        while (totalWorkingDays < company.maxWorkingDays && totalWorkingHours < company.maxWorkingHours) {
            int attendance = random.nextInt(3);
            int dailyWage = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Employee absent");
                    break;
                case 1:
                    System.out.println("Full-time");
                    dailyWage = company.wagePerHour * company.fullDayHour;
                    totalWorkingHours += company.fullDayHour;
                    break;
                case 2:
                    System.out.println("Part-time");
                    dailyWage = company.wagePerHour * company.partTimeHour;
                    totalWorkingHours += company.partTimeHour;
                    break;
            }

            totalWage += dailyWage;
            totalWorkingDays++;
            System.out.println("Day " + totalWorkingDays + ": Daily Wage = " + dailyWage);
        }
        System.out.println("================================");
        return totalWage;
    }
}
