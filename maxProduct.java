import java.util.*;
public class maxProduct{
    public static int maxPro(int nums[]){
       int prefix = 1;
       int suffix = 1;
       int max = 1;
       for(int i = 0; i < nums.length; i++){
        prefix = (prefix == 0)? 1 : prefix;
        suffix = (suffix == 0)? 1 : suffix;

        prefix *= nums[i];
        suffix *= nums[nums.length - 1 - i];

        max = Math.max(max, Math.max(prefix, suffix));
       }
       return max;
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
        int result = maxPro(nums);
        System.out.println(result);
        scanner.close();

    }
}
