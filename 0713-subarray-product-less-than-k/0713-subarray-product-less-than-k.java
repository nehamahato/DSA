class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        //int product = 1;
        int count = 0;
        if(k<=1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            long product = 1;
            for(int j=i;j<nums.length;j++){
                product *= nums[j];
                if(product<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}