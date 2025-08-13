class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<nums.length-2;i++){
            // if(i!=0 && nums[i]==nums[i-1]){
            //     continue;
            // }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-sum);
                if(diff<minDiff){
                    minDiff = diff;
                    ans = sum;
                }
                if(sum==target){
                    return target;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}