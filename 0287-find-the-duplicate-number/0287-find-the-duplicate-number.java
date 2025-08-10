// class Solution {
//     public int findDuplicate(int[] nums) {

//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return nums[i];
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int abs = Math.abs(nums[i]);
            if(nums[abs]<0){
                return abs;
            }
            nums[abs] = -nums[abs];
        }
        return -1;
    }    
}