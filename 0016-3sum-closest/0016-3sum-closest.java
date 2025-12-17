class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int resSum = nums[0] + nums[1] + nums[2];

        for(int i=0;i<nums.length-2;i++){
            // while(i>0 && nums[i]==nums[i-1]){
            //     continue;
            // }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int currSum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-currSum) <Math.abs(target-resSum)){
                    resSum = currSum;
                }
                if(currSum==target){
                    return currSum;
                }
                else if(currSum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return resSum;
    }
}