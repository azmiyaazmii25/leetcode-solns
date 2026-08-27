class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums){
            res=res ^ num; 
            // XOR operation. It will eleiminate same numbers to 0 ,o with any number gives the same numberas output  ( 0 ^ a = a).
        }
        return res;
    }
}