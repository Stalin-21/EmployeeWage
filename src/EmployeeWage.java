import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage computation program.");

        System.out.println("Computing wages for multiple companies:\n");

        computeEmployeeWage("TCS", 20, 8, 4, 20, 100);
        System.out.println();
        computeEmployeeWage("Infosys", 22, 8, 4, 22, 120);
    }



    public static void computeEmployeeWage(String companyName, int wagePerHour, int fullDayHour, int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
         int totalWage =0;
         int totalWorkingHours = 0;
         int totalWorkingDays = 0;
         Random random = new Random();

        System.out.println("Calculating wages for " + companyName);

        while(totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {

            int attendance = random.nextInt(3); // 0-absent // 1 - present full time // 2 - present part-time
            int dailyWage =0;
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

                default:
                    System.out.println("Invalid attendance");
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
}
