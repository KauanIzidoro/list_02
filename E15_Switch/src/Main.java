import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Insert the money: ";
        String menu_option_0 = "1. Espresso R$ 0,50";
        String menu_option_1 = "2. Long coffee R$ 1,00";
        String menu_option_2 = "3. Cappuccino R$ 2,50";
        String menu_option_3 = "4. Chocolate R$ 2,00";
        String decimal_limit = "#.##";
        double user_money, user_change;
        int user_option;

        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(decimal_limit);

        System.out.print(system_phrase_1);
        user_money = in.nextDouble();

        System.out.println("Menu: ");
        System.out.println(menu_option_0);
        System.out.println(menu_option_1);
        System.out.println(menu_option_2);
        System.out.println(menu_option_3);

        System.out.print("Choose a option from the menu: ");
        user_option = in.nextInt();

        if(user_money > 0.50){
            switch (user_option) {
                case 1:
                    System.out.println("Selected drink: " + menu_option_0);
                    user_change = user_money - 0.50;
                    if(user_change < 0){
                        System.out.println("Your balance is insufficient.");
                    } else if (user_change > 0) {
                        System.out.println("Your change is: " + "R$ " + format.format(user_change));
                    }
                    break;
                case 2:
                    System.out.println("Selected drink: " + menu_option_1);
                    user_change = user_money - 1.00;
                    if(user_change < 0){
                        System.out.println("Your balance is insufficient");
                    }else if(user_change > 0){
                        System.out.println("Your change is: " + "R$ " + format.format(user_change));
                    }
                    break;
                case 3:
                    System.out.println("Selected drink: " + menu_option_2);
                    user_change = user_money - 2.50;
                    if(user_change < 0){
                        System.out.println("Your balance is insufficient");
                    }else if(user_change > 0){
                        System.out.println("Your change is: " + "R$ " + format.format(user_change));
                    }
                    break;
                case 4:
                    System.out.println("Selected drink: " + menu_option_3);
                    user_change = user_money - 2.00;
                    if(user_change < 0){
                        System.out.println("Your balance is insufficient");
                    }else if(user_change > 0){
                        System.out.println("Your change is: " + "R$ " + format.format(user_change));
                    }
                    break;
                default:
                    System.out.println("This is not a menu option");
                    break;
            }
        }else if (user_money == 0.50){
            switch(user_option){
                case 1:
                    System.out.println("Selected drink: " + menu_option_0);
                    user_change = user_money - 0.50;
                    System.out.println("Your change is: " + "R$ " + format.format(user_change));
                    break;
                default:
                    System.out.println("Your balance is insufficient.");
                    break;
            }
        }
    }
}
