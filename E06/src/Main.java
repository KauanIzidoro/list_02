import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String system_phrase_1 = "Choose an option from the menu below: ";
        String option_1 = "5. Option";
        String option_2 = "6. Option";
        String option_3 = "7. Option";
        String option_4 = "8. Option";
        String option_5 = "9. Option";
        String system_phrase_2 = "Invalid option.";
        int user_option;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        System.out.println(option_1);
        System.out.println(option_2);
        System.out.println(option_3);
        System.out.println(option_4);
        System.out.println(option_5);

        user_option = in.nextInt();

        if(user_option == 5){
            System.out.println("You chose: " + option_1);
        } else if (user_option == 6) {
            System.out.println("You chose: " + option_2);
        } else if (user_option == 7) {
            System.out.println("You chose: " + option_3);
        } else if (user_option == 8) {
            System.out.println("You chose: " + option_4);
        } else if (user_option == 9) {
            System.out.println("You chose: " + option_5);
        }else{
            System.out.println(system_phrase_2);
        }
    }
}
