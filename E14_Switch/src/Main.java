import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the purchase amount: ";
        String system_phrase_2 = "Menu";
        String menu_phrase_1 = "1. Debit";
        String menu_phrase_2 = "2. Pix";
        String menu_phrase_3 = "3. Credit";
        String system_phrase_3 = "Choose the payment method: ";
        String decimal_limit = "#.##";
        double purchase_amount, payment_amount;
        double debit_discount = 0.05;
        double pix_discount = 0.10;
        int numbers_installments;
        int payment_method;

        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(decimal_limit);

        System.out.print(system_phrase_1);
        purchase_amount = in.nextDouble();

        System.out.println(system_phrase_2);
        System.out.println(menu_phrase_1);
        System.out.println(menu_phrase_2);
        System.out.println(menu_phrase_3);

        System.out.print(system_phrase_3);
        payment_method = in.nextInt();

        switch (payment_method){
            case 1:
                System.out.println("Debit has been select");
                payment_amount = purchase_amount-(purchase_amount*debit_discount);
                System.out.println("Purchase amount = " + purchase_amount);
                System.out.println("Debit discount = 5%");
                System.out.println("Payment value = " + "R$ " + format.format(payment_amount));
                break;
            case 2:
                System.out.println("Pix has been select");
                payment_amount = purchase_amount-(purchase_amount*pix_discount);
                System.out.println("Purchase amount = " + purchase_amount);
                System.out.println("Pix discount = 10%");
                System.out.println("Payment value = " + "R$ " + format.format(payment_amount));
                break;
            case 3:
                System.out.println("Credit has been select");
                System.out.print("Choose numbers of installments: ");
                numbers_installments = in.nextInt();

                if(numbers_installments <= 4){
                    payment_amount = purchase_amount+(purchase_amount*0.02);
                    System.out.println("Purchase amount = " + purchase_amount);
                    System.out.println("Credit interest = 2%");
                    System.out.println("Payment value = " + "R$ " + format.format(payment_amount));

                }else{
                    payment_amount = purchase_amount+(purchase_amount*0.05);
                    System.out.println("Purchase amount = " + purchase_amount);
                    System.out.println("Credit interest = 5%");
                    System.out.println("Payment value = " + "R$ " + format.format(payment_amount));
                }
                break;
            default:
                System.out.println("This is not a menu option");
        }
    }
}
