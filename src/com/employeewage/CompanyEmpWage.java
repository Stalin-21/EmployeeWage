package com.employeewage;

import java.util.ArrayList;

public class CompanyEmpWage {
    public final String companyName;
    public final int wagePerHour;
    public final int fullDayHour;
    public final int partTimeHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;
    public int totalWage;
    public ArrayList<Integer> dailyWages = new ArrayList<>();

    public CompanyEmpWage(String companyName, int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + companyName +
                ", Total Wage: " + totalWage +
                ", Daily Wages: " + dailyWages; // UC13
    }
}
