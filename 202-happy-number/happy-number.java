class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> visit =new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n=getNextNumber(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    private static int getNextNumber(int n){
        int output=0;
        while(n>0){
            int digit=n%10;
            output+=digit*digit;
            n=n/10;
        }
        return output;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=isHappy(n);
        System.out.print(res);
    }
}