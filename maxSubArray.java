import java.util.*;
public class maxSubArray{
    public static int kadene(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : nums){
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }

        }
        return maxSum;
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
        int result = kadene(nums);
        System.out.println(result);
        scanner.close();

    }
}