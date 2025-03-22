import java.util.*;
public class arrayProduct{
    public static int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for(int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        int right_answer = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            answer[i] = answer[i] * right_answer;
            right_answer = right_answer * nums[i];
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

    
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt(); 
        }
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));

    }
}