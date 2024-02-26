import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a first integer: ";
        String system_phrase_2 = "Enter a second integer: ";
        String system_phrase_3 = "Enter a third integer: ";
        int[] nums = new int[3];
        int number_t;

        Scanner in = new Scanner(System.in);

        System.out.println(system_phrase_1);
        nums[0] = in.nextInt();
        System.out.println(system_phrase_2);
        nums[1] = in.nextInt();
        System.out.println(system_phrase_3);
        nums[2] = in.nextInt();

        if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]){
            System.out.println("Enter different numbers, please.");
        }else{
            for(int i=1; i<nums.length; i++){
                for(int j=0;j<i; j++){
                    if(nums[i] < nums[j]){
                        number_t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = number_t;
                    }
                }
            }
            System.out.println(nums[0] + "<" + nums[1] + "<" + nums[2]);
        }
    }
}

