import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage =0;
        Random random = new Random();

        int attendance = random.nextInt(3); // 0-absent // 1 - present full time // 2 - present part time

     switch (attendance){
         case 0:
             System.out.println("Employee absent");
             break;
         case 1:
             System.out.println("Employee present: Full time");
             dailyWage = wagePerHour * fullDayHour;
             break;
         case 2:
             System.out.println("Employee present: Part time");
             dailyWage = wagePerHour * partTimeHour;
             break;

             default:
                 System.out.println("Invalid attendance");
                 break;
     }

        System.out.println("Daily Wage: "+dailyWage);
    }
}
