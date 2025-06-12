import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        Random random = new Random();

        int attendance = random.nextInt(2);

       if(attendance == 0){
           System.out.println("Employee not present");
       }else{
           System.out.println("Employee present");
       }
    }
}
