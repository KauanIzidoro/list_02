import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a integer: ";
        String system_phrase_2 = "Your number is even";
        String system_phrase_3 = "Your number is odd";
        int number_1, rest;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        number_1 = in.nextInt();

        rest = number_1 % 2;


        if(rest == 0){
            System.out.println(system_phrase_2);
        }else{
            System.out.println(system_phrase_3);
        }
    }
}
