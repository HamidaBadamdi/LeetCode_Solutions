package placement_prep;

/**
 * LeetCode 121 - Best Time to Buy and Sell Stock
 *
 * Description:
 * Finds the maximum profit from a single buy and sell transaction
 * by tracking the minimum stock price and maximum profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Your Name
 */

public class BuySell_Stock {

	public static int maxProfit(int prices[])
	{
		int min_price = Integer.MAX_VALUE;
		int max_profit = 0;
		int buy_price = 0;
		int sell_price = 0;
		
		for (int price : prices)
		{
			if (price < min_price)
			{
				min_price = price;
			}
			
			int profit = price - min_price;
			
			if(profit > max_profit)
			{
				max_profit = profit;
				buy_price = min_price;
				sell_price = price;
			}
		}
		
		System.out.println("Buy Price :" + buy_price);
		System.out.println("Sell Price :" + sell_price);
		System.out.println("Max Profit : " + max_profit);
		return max_profit;
	}
	public static void main(String[] args) {
		
		int prices[] = {7, 1, 5, 3, 6, 4};
		
		maxProfit(prices);
		
	}
}
