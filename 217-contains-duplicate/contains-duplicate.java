class Solution {
    public boolean containsDuplicate(int[] nums) {
/*          Arrays.sort(nums);
        int i=0;
        int j=1;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j=j+1;
            } else
            return true;

        }
        return false; */

        Set<Integer> Set= new HashSet<>();
        for(int num:nums){
            if(Set.contains(num)){
                return true;
            }
            Set.add(num);
        }
      return false;
    }
}