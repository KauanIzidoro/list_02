import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the first grade: ";
        String system_phrase_2 = "Enter the second grade: ";
        String system_phrase_3 = " enter the recovery grade: ";
        String system_phrase_4 = "Your average is: ";
        double n1, n2, r_n3, average_1, average_2;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        n1 = in.nextDouble();
        System.out.println(system_phrase_2);
        n2 = in.nextDouble();

        average_1 = (n1+n2)/2;

        if(average_1 >= 50){
            System.out.println(system_phrase_4 + average_1 + "," + " Approved.");

        }else {
            System.out.println(system_phrase_4 + average_1 + "," + system_phrase_3);
            r_n3 = in.nextDouble();

            average_2 = (average_1+r_n3)/2;

            if(average_2 < 50){
                System.out.println(system_phrase_4 + average_2 + "," + " Rejected.");
            }else{
                System.out.println(system_phrase_4 + average_2 + "," + " Approved.");
            }
        }
    }
}
