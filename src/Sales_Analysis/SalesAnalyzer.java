package Sales_Analysis;

public class SalesAnalyzer {

	private double[] sales;
	String[] days = { "sun", "mon", "tue", "wed", "thu", "Fri","sat" };

	public SalesAnalyzer(int numberOfDays) {
		sales = new double[numberOfDays];
		for (String day : days) {
			System.out.println(day);
		}
	}
	public void addSale(double saleAmount, int day) {
        if (day < 0 || day >= sales.length) {
            System.out.println("Invalid day. Sale not added.");
            return;
        }
        sales[day] = saleAmount;
    }


	

}
