import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage =0;
        Random random = new Random();

        int attendance = random.nextInt(3); // 0-absent // 1 - present full time // 2 - present part time

        if(attendance == 0){
            System.out.println("Employee not present");
        }else if(attendance == 1){
            System.out.println("Employee present");
        }else {
            System.out.println("Part time Employee present");
        }


        if(attendance == 1){
            dailyWage = fullDayHour*wagePerHour;
        } else if (attendance == 2) {
            dailyWage = partTimeHour*wagePerHour;
        }

        System.out.println("Daily Wage: "+dailyWage);
    }
}
