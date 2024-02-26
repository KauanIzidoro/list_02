import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the first grade: ";
        String system_phrase_2 = "Enter the second grade: ";
        String system_phrase_3 = "Your average is: ";
        double n1, n2, average;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        n1 = in.nextDouble();
        System.out.println(system_phrase_2);
        n2 = in.nextDouble();

        average = (n1+n2)/2;

        if (average >= 8.5){
            System.out.println(system_phrase_3 + average + "," + " Concept A");
        } else if (average < 8.5 && average >= 7) {
            System.out.println(system_phrase_3 + average + "," + " Concept B");
        } else if (average < 7 && average >= 5) {
            System.out.println(system_phrase_3 + average + "," + " Concept C");
        } else if (average < 5) {
            System.out.println(system_phrase_3 + average + "," + " Concept D");
        }
    }
}
