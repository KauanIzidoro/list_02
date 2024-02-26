import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter first integer: ";
        String system_phrase_2 = "Enter second integer: ";
        String system_phrase_3 = "The largest number is: ";
        int a, b, largest;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        a = in.nextInt();
        System.out.println(system_phrase_2);
        b = in.nextInt();

        if(a == b){
            System.out.println("Enter different numbers, please.");
        }else{
            largest = (a+b+Math.abs(a-b))/2;
            System.out.println(system_phrase_3 + largest);
        }
    }
}
