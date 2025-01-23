class Solution {
    public static boolean isPalindrome(int x) {
        int temp=0;
        int rev=0;
        int rem=0;
        temp=x;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(temp==rev){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean ispalindrome=isPalindrome(x);
        if(ispalindrome){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}