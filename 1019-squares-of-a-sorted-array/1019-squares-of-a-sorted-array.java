// class Solution {
//     public int[] sortedSquares(int[] nums) {
        
//         for(int i=0;i<nums.length;i++){
//             nums[i] = nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int res[] = new int[nums.length];
        int index = nums.length-1;

        while(i<=j){
            
            int leftSquare = nums[i]*nums[i];
            int rightSquare = nums[j]*nums[j];

            if(leftSquare>rightSquare){
                res[index] = leftSquare;
                i++;
            }
            else{
                res[index] = rightSquare;
                j--;
            }
            index--;
        }
        return res;
    }  
}
