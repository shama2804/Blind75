import java.util.*;
public class Stocks{
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for(int price: prices){
            if(price < min){
                min = price;
            }
            maxProfit = Math.max(maxProfit, price-min);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = scanner.nextInt();
        int[] prices = new int[days];
        System.out.println("Enter the prices of the days: ");
        for(int i = 0;i < days; i++){
            prices[i] = scanner.nextInt();
        }
        int res = maxProfit(prices);
        System.out.println("Max Profit: "+res);
    }
}