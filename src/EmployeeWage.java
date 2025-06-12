import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;
        int totalWage =0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        while(totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {

            int attendance = random.nextInt(3); // 0-absent // 1 - present full time // 2 - present part-time
            int dailyWage =0;
            switch (attendance) {
                case 0:
                    System.out.println("Employee absent: No work done");

                    break;
                case 1:
                    System.out.println("Employee present: Full time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingHours += FULL_DAY_HOUR;
                    break;
                case 2:
                    System.out.println("Employee present: Part time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingHours += PART_TIME_HOUR;
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

        System.out.println("===========================");
        System.out.println("Total Wage: "+totalWage);
        System.out.println("Total working days: "+totalWorkingDays);
        System.out.println("Total working hours: "+totalWorkingHours);

    }
}
