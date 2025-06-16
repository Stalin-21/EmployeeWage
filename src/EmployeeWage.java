import java.util.Random;

class EmpWageBuilder {
    // Instance Variables
    private String companyName;
    private int wagePerHour;
    private int fullDayHour;
    private int partTimeHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    // Constructor
    public EmpWageBuilder(String companyName, int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Method to compute employee wage
    public void computeEmployeeWage() {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        System.out.println("Calculating wages for " + companyName);

        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
            int attendance = random.nextInt(3); // 0 - absent, 1 - full time, 2 - part time
            int dailyWage = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Employee absent: No work done");
                    break;
                case 1:
                    System.out.println("Employee present: Full time");
                    dailyWage = wagePerHour * fullDayHour;
                    totalWorkingHours += fullDayHour;
                    break;
                case 2:
                    System.out.println("Employee present: Part time");
                    dailyWage = wagePerHour * partTimeHour;
                    totalWorkingHours += partTimeHour;
                    break;
            }

            totalWage += dailyWage;
            totalWorkingDays++;
            System.out.println("Day " + totalWorkingDays + ": Daily Wage = " + dailyWage);
            System.out.println("---------------------------");
        }

        System.out.println("-----------------------------");
        System.out.println("Company: " + companyName);
        System.out.println("Total Wage: " + totalWage);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("-----------------------------");
    }

    // Getter
    public int getTotalWage() {
        return totalWage;
    }
}

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        System.out.println("Computing wages for multiple companies:\n");

        EmpWageBuilder tcs = new EmpWageBuilder("TCS", 20, 8, 4, 20, 100);
        tcs.computeEmployeeWage();

        System.out.println();

        EmpWageBuilder infosys = new EmpWageBuilder("Infosys", 22, 8, 4, 22, 120);
        infosys.computeEmployeeWage();
    }
}
