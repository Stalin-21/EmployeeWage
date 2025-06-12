import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage =0;
        Random random = new Random();

        int attendance = random.nextInt(2);

       if(attendance == 0){
           System.out.println("Employee not present");
       }else{
           System.out.println("Employee present");
       }


       if(attendance == 1){
           dailyWage = fullDayHour*wagePerHour;
       }

       System.out.println("Daily Wage: "+dailyWage);
    }
}
