class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else
             {
            digits[i]=digits[i]+1;
            return digits;
            }
        }
        int res[]=new int[digits.length+1];// because new array shud be of +1csize. 99-> 100
        res[0]=1;
        return res;
    }
}