import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a integer: ";
        String system_phrase_2 = "Enter a second integer: ";
        String system_phrase_3 = "This is the largest number: ";
        int number_1, number_2, subtraction_numbers_1;

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        number_1 = in.nextInt();

        System.out.println(system_phrase_2);
        number_2 = in.nextInt();
        if(number_1 == number_2){
            System.out.println("Enter different numbers, please.");
        }else{
            subtraction_numbers_1 = number_1 - number_2;

            if (subtraction_numbers_1 > 0) {
                System.out.println(system_phrase_3 + number_1);
            } else{
                System.out.println(system_phrase_3 + number_2);
            }
        }
    }
}
