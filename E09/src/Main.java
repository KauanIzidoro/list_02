import java.util.Scanner;
import java.lang.*;



public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a first side of triangle: ";
        String system_phrase_2 = "Enter a second side of triangle: ";
        String system_phrase_3 = "Enter a third side of triangle: ";
        double a, b, c, sum_ab, sum_ac, sum_bc;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        a = in.nextDouble();
        System.out.println(system_phrase_2);
        b = in.nextDouble();
        System.out.println(system_phrase_3);
        c = in.nextDouble();

        sum_ab = a+b;
        sum_ac = a+c;
        sum_bc = b+c;

        if (a < sum_bc && b < sum_ac && c < sum_ab){
            if (a == b && b == c){
                System.out.println("This triangle is equilateral.");
            } else if (a == c || c == b || a == b) {
                System.out.println("This triangle is isosceles");
            }else{
                System.out.println("This triangle is scalene");
            }
        }else{
            System.out.println("Segments with these measures do not form a triangle");
        }
    }
}
