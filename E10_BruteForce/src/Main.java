import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String system_phrase_1 = "Enter a first integer: ";
        String system_phrase_2 = "Enter a second integer: ";
        String system_phrase_3 = "Enter a third integer: ";
        int a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        a = in.nextInt();
        System.out.println(system_phrase_2);
        b = in.nextInt();
        System.out.println(system_phrase_3);
        c = in.nextInt();

        if(a == b || a == c || b == c){
            System.out.println("Enter different numbers, please.");
        }else{
            if(a>b && b>c){
                System.out.println(c + "<" + b + "<" + a);
            }else if(a>c && c>b){
                System.out.println(b + "<" + c + "<" + a);
            } else if (b>a && a>c){
                System.out.println(c + "<" + a + "<" + b);
            }else if(c>b && b>a){
                System.out.println(a + "<" + b + "<" + c);
            }else if(c>a && a>b){
                System.out.println(b + "<" + a + "<" + c);
            }else if(b>c && c>a){
                System.out.println(a + "<" + c + "<" + b);
            }
        }
    }
}