import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a integer: ";
        String user_phrase_1 = "Your number corresponds to the day: ";
        String day_1 = "1. Sunday";
        String day_2 = "2. Monday";
        String day_3 = "3. Tuesday";
        String day_4 = "4. Wednesday";
        String day_5 = "5. Thursday";
        String day_6 = "6. Friday";
        String day_7 = "7. Saturday";
        int user_number;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);

        user_number = in.nextInt();

        switch (user_number) {
            case 1:
                System.out.println(user_phrase_1 + day_1);
                break;
            case 2:
                System.out.println(user_phrase_1 + day_2);
                break;
            case 3:
                System.out.println(user_phrase_1 + day_3);
                break;
            case 4:
                System.out.println(user_phrase_1 + day_4);
                break;
            case 5:
                System.out.println(user_phrase_1 + day_5);
                break;
            case 6:
                System.out.println(user_phrase_1 + day_6);
                break;
            case 7:
                System.out.println(user_phrase_1 + day_7);
                break;
            default:
                System.out.println("Your number does not correspond to any of the options.");
                break;
        }
    }
}
