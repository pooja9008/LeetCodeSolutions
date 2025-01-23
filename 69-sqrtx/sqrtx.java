import java.util.*;
import java.lang.Math;
class Solution {
    public static int mySqrt(int x) {
        
        return (int)Math.sqrt(x);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(mySqrt(x));
    }
}