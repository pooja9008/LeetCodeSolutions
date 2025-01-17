import java.util.Scanner;
class Solution {
    //pooja_salunke
    public static int[] twoSum(int[] ar, int target) {
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int[] res=Solution.twoSum(ar,target);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}