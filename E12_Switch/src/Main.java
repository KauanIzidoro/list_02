import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
        String system_phrase_1 = "Enter a number: ";
        String system_phrase_2 = "Enter another number: ";
        String menu_phrase_0 = "Menu: ";
        String menu_phrase_1 = "1. Sum";
        String menu_phrase_2 = "2. Subtraction";
        String menu_phrase_3 = "3. Multiplication";
        String menu_phrase_4 = "4. Division";
        String decimal_limit = "#.###";
        double number_1, number_2, result;
        int user_menu;

        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(decimal_limit);

        System.out.printf(system_phrase_1);
        number_1 = in.nextDouble();
        System.out.printf(system_phrase_2);
        number_2 = in.nextDouble();

        System.out.println(menu_phrase_0);
        System.out.println(menu_phrase_1);
        System.out.println(menu_phrase_2);
        System.out.println(menu_phrase_3);
        System.out.println(menu_phrase_4);
        System.out.print("Choose a option: ");
        user_menu = in.nextInt();

        switch (user_menu){
            case 1:
                result = number_1+number_2;
                System.out.println("Result: " + number_1 + " + " + number_2 + " = " +  format.format(result));
                break;
            case 2:
                result = number_1-number_2;
                System.out.println("Result: " + number_1 + " - " + number_2 + " = " +  format.format(result));
                break;
            case 3:
                result = number_1*number_2;
                System.out.println("Result: " + number_1 + " x " + number_2 + " = " +  format.format(result));
                break;
            case 4:
                result = number_1/number_2;
                System.out.println("Result: " + number_1 + " / " + number_2 + " = " +  format.format(result));
                break;
            default:
                System.out.println("This not a option from the menu.");
                break;
        }
    }
}