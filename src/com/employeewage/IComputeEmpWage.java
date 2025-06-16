package com.employeewage;

public interface IComputeEmpWage {
    void addCompanyEmpWage(String company, int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours);
    void computeEmpWage();
}
