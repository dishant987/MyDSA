// Stock Buy and Sell – Max 2 Transactions Allowed

public class p24 {
    public static void main(String[] args) {
        int[] prices = { 10, 22, 5, 75, 65, 80 };
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;

        for (int i : prices) {
        
        buy1 = Math.max(buy1,-i);
        sell1 = Math.max(sell1, buy1+i);
        buy2 = Math.max(buy2, sell1-i);
        sell2 = Math.max(sell2, buy2+i);
        }
        System.out.println(sell2);
    }
}
