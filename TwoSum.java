import java.util.*;
public class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }    
        return new int[]{}; 
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

        System.out.println("Enter the target element: ");
        int target = scanner.nextInt();

        int[] res = twoSum(nums,target);
        System.out.println("Indices: " + res[0] + ", " + res[1]);


    }
}