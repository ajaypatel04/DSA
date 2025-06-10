class Solution {
    public int findDuplicate(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c= nums[i];
                break;
            }

        }
        return c;
        
    }
}