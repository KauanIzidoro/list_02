import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the first grade: ";
        String system_phrase_2 = "Enter the second grade: ";
        String system_phrase_3 = "Your average is: ";
        String system_phrase_4 = " Approved.";
        String system_phrase_5 = " Rejected.";
        double n1, n2, average;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        n1 = in.nextDouble();
        System.out.println(system_phrase_2);
        n2 = in.nextDouble();

        average = (n1+n2)/2;

        if(average < 50) {
            System.out.println(system_phrase_3 + average + "," + system_phrase_5);
        }else{
            System.out.println(system_phrase_3 + average + "," + system_phrase_4);
        }
    }
}
