class Solution {
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }  
        return max; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int max=Solution.maxSubArray(nums);
        System.out.print(max);
    }
}