// class Solution {
//     public int findUnsortedSubarray(int[] nums) {

//         int left = nums.length;
//         int right = 0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]>nums[j]){
//                     left = Math.min(left,i);
//                     right = Math.max(right,j);
//                 }
//             }
//         }
//         return right-left>=0?right-left+1:0;
        
//     }
//}

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = -1,end=-2;
        int max = nums[0], min = nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            if(max>nums[i]){
                end = i;
            }
        }

        for(int i=nums.length-2;i>=0;i--){
            min = Math.min(min,nums[i]);
            if(min<nums[i]){
                start = i;
            }
        }
        return end=start>=0?end-start+1:0;

    }
}