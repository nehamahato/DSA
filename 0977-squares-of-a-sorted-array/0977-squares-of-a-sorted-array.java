class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;

        while(left<=right){
            int leftSqr = nums[left]*nums[left];
            int rightSqr = nums[right]*nums[right];

            if(leftSqr>rightSqr){
                res[index--] = leftSqr;
                left++;
            }
            else{
                res[index--] = rightSqr;
                right--;
            }
        }
        return res;
    }
}