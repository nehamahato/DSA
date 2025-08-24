class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int left = nums.length;
        int right = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    left = Math.min(left,i);
                    right = Math.max(right,j);
                }
            }
        }
        return right-left>=0?right-left+1:0;
        
    }
}