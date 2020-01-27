
/**
 * LeapYear
 */
import java.io.Console;
public class LeapYear {

    public static void main(String[] args) {
        Console console= System.console();
        System.out.println("When were you born in?");
        String stringBirthYear = console.readLine();
        Integer birthYear = Integer.parseInt(stringBirthYear);
        System.out.println("You were alive during this leap years");
        for(Integer year  = birthYear; year<2020;year++){
            if(year%4 == 0){
                System.out.println(year);
            }
        }

        
    }
}