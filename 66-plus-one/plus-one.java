class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digits[]=new int[n];
        for(int i=0;i<digits.length;i++){
            digits[i]=sc.nextInt();
        }
        int[] res=plusOne(digits);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}