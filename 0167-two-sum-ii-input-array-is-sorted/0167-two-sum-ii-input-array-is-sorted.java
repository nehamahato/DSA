// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int[] ans = new int[2];
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     ans[i,j];
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0 ; 
        int j = numbers.length-1;

        while(i<j){
            if(numbers[i] + numbers[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}