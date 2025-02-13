class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        
    }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] nums1=new int[m];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] nums2=new int[n];
        for(int i=0;i<nums2.length;i++){
            nums2[i]=sc.nextInt();
        }
        merge(nums1,m,nums2,n);
    }
}