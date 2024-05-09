package Sales_Analysis;

import java.util.Scanner;

public class Demo {
	 int Sales = 7;

	int[] sales = new int[Sales];
	Scanner sc = new Scanner(System.in);

	String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	int sum = 0;
	int totalSales;

	public void Addamount() {
		for (int i = 0; i < sales.length; i++) {
			System.out.println("enter a amount :" + i + " :-	");
			sales[i] = sc.nextInt();
		}

	}
	
	public int CalculateTotalSales() {
	    sum = 0; 
	    System.out.println("---------- Print Total Sale Start ----------");
	    
	    for (int i = 0; i < sales.length; i++) {
	        System.out.println("Sale per day amount on day " + day[i] + ": " + sales[i]);
	        sum += sales[i];
	    }
	    
	    System.out.println("---------- Print Total Sale End --------");
	    System.out.println("Total Sales for the week: " + sum);
	    int monthlyTotalSales = sum * 4;
	    
	    System.out.println("Total Sale per month (approximation based on weekly sales): " + monthlyTotalSales);
	    
	    return monthlyTotalSales;
	}

	public int FindBestSalesDay() {
		int BestSale = sales[0];
		int BestDaySale = 0;

		for (int i = 1; i < sales.length; i++) {
			if (sales[i] > BestSale) {
				BestSale = sales[i];
				BestDaySale = i;
			}

		}
		if (BestDaySale != 0) {

			System.out.println(
					"Highest sales Day : " + day[BestDaySale] + " , " + "  Highest amount in day :" + BestSale);
		} else {
			System.out.println("no sales in the day");
		}
		return BestDaySale;

	}
	
	public int FindWorstSalesDay() {
	    int worstSale = sales[0];
	    int worstDayIndex = 0;

	    for (int i = 1; i < sales.length; i++) {
	        if (sales[i] < worstSale) {
	            worstSale = sales[i];
	            worstDayIndex = i;
	        }
	    }

	    System.out.println("Lowest sales day: " + day[worstDayIndex] + " with sales of " + worstSale);
	    return worstDayIndex;
	}

	public void DisplaySalesReport() {
		double averageSales = sum / (double) Sales;

		int bestDay = FindBestSalesDay();
		int worstDay = FindWorstSalesDay();

		System.out.println("----------- Sales Report Start -----------");
	System.out.println("Total Sales for the week: " + sum);
		System.out.println("Average daily sales: " + averageSales);
		System.out.println("Best sales day: " + day[bestDay] + " with sales of " + sales[bestDay]);
		System.out.println("Worst sales day: " + day[worstDay] + " with sales of " + sales[worstDay]);
		System.out.println("--------------- Sales Report  End-----------");
	}

}
