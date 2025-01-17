import java.util.Scanner;
class Solution {
    public static int maxProfit(int[] prices) {
        int minProfit=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(minProfit>price){
                minProfit=price;
            }
            else if(price-minProfit>maxProfit){
                maxProfit=price-minProfit;
            }
        } 
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=1;i<=prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int profit=Solution.maxProfit(prices);
        System.out.print(profit);
    }
}