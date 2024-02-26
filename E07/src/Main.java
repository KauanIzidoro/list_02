import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the quadratic coefficient of the equation: ";
        String system_phrase_2 = "Enter the linear coefficient of the equation: ";
        String system_phrase_3 = "Enter the constant coefficient of the equation: ";
        String user_phrase_1 = "Your equation is: ";
        String user_phrase_2 = "There roots of this equation is: ";
        double coef_a, coef_b, coef_c, Re, Im;
        String decimal_limit = "#.###";

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(decimal_limit);



        coef_a = in.nextDouble();
        System.out.println(system_phrase_2);
        coef_b = in.nextDouble();
        System.out.println(system_phrase_3);
        coef_c = in.nextDouble();

        System.out.print(user_phrase_1 + coef_a + "x^2");

        if (coef_b >= 0) {
            System.out.print(" + " + coef_b + "x");
        } else {
            System.out.print(" - " + -coef_b + "x");
        }if (coef_c >= 0) {
            System.out.println(" + " + coef_c + " = 0");
        } else {
            System.out.println(" - " + -coef_c + " = 0");
        }

        double deltaSign = Math.pow(coef_b, 2) - 4 * coef_a * coef_c;

        if (deltaSign >= 0) {
            double root_1 = (-coef_b + Math.sqrt(deltaSign)) / (2 * coef_a);
            double root_2 = (-coef_b - Math.sqrt(deltaSign)) / (2 * coef_a);

            System.out.println(user_phrase_2 + " " + format.format(root_1) + " and " + format.format(root_2));
        } else {
            System.out.println("Your equation doesn't have real roots.");
            Re = -coef_b/(2*coef_a);
            Im = Math.sqrt(Math.abs(deltaSign))/(2*coef_a);

            System.out.println("X1 = " + format.format(Re) + "-" + format.format(Im) + "i");
            System.out.println("X2 = " + format.format(Re) + "+" + format.format(Math.abs(Im)) + "i");
        }
    }
}