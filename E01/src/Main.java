import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;


public class Main{
    public static void main(String[] args){
        String system_phrase_1 = "Enter a real number: ";
        String system_phrase_2 = "Invalid value! ";
        String decimal_limit = "#.###";
        String decimal_setup;
        double user_number, sq_number;

        System.out.println(system_phrase_1);
        DecimalFormat format = new DecimalFormat(decimal_limit);
        Scanner in = new Scanner(System.in);

        user_number = in.nextDouble();


        if (user_number > 0){
            sq_number = Math.sqrt(user_number);
            decimal_setup = format.format(sq_number);
            System.out.println(decimal_setup);
        } else {
            System.out.println(system_phrase_2);
        }
    }
}