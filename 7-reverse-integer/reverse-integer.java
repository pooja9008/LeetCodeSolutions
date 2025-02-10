class Solution {
    public static int reverse(int x) {
      long reverse=0;
      while(x!=0){
        reverse=reverse*10 + x%10;
        x=x/10;
      }
      if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
        return 0;
      }  

      return (int) reverse;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=reverse(num);
        System.out.print(res);

    }
}