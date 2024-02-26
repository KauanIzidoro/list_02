import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Menu: ";
        String menu_option_1 = "1. Circle";
        String menu_option_2 = "2. Right-angled triangle";
        String menu_option_3 = "3. Rectangle";
        String system_phrase_2 = "Choose a option from the menu: ";
        String decimal_limit = "#.###";
        int user_option;
        double base_length, height_length, radius_length;
        double area, perimeter;
        double pi = Math.PI;


        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(decimal_limit);

        System.out.println(system_phrase_1);
        System.out.println(menu_option_1);
        System.out.println(menu_option_2);
        System.out.println(menu_option_3);
        System.out.print(system_phrase_2);
        user_option = in.nextInt();

        switch(user_option) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                radius_length = in.nextDouble();

                area = Math.PI * Math.pow(radius_length, 2);
                perimeter = 2 * radius_length * Math.PI;

                System.out.println("Area = " + format.format(area) + "cm^2");
                System.out.println("Perimeter = " + format.format(perimeter) + "cm");
                break;

            case 2:
                System.out.print("Enter the base length: ");
                base_length = in.nextDouble();
                System.out.print("Enter the height length: ");
                height_length = in.nextDouble();

                area = (base_length*height_length)/2;
                double hypotenuse = Math.sqrt(Math.pow(base_length, 2) + Math.pow(height_length, 2));
                perimeter = base_length+height_length+hypotenuse;

                System.out.println("Area = " + format.format(area) + "cm^2");
                System.out.println("Perimeter = " + format.format(perimeter) + "cm");
                break;
            case 3:
                System.out.print("Enter the base length: ");
                base_length = in.nextDouble();
                System.out.print("Enter the height length: ");
                height_length = in.nextDouble();

                area = base_length*height_length;
                perimeter = 2*(base_length+height_length);

                System.out.println("Area = " + format.format(area) + "cm^2");
                System.out.println("Perimeter = " +  format.format(perimeter) + "cm");
                break;
            default:
                System.out.println("This is not a menu option.");
                break;
        }
    }
}
