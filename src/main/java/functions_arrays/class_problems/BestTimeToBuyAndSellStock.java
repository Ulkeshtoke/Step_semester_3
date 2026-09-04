

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        int result = stock.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);

        scanner.close();
    }
}