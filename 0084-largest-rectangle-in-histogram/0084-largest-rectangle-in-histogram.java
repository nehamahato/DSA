// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int n = heights.length;
//         int maxArea = 0;

//         for(int i=0;i<n;i++){
//             int height = heights[i];

//             int rightmost = i;
//             while(rightmost<n && heights[rightmost]>=height){
//                 rightmost++;
//             }
//             int leftmost = i;
//             while(leftmost>=0 && heights[leftmost]>=height){
//                 leftmost--;
//             }
//             maxArea = Math.max(maxArea,height*(rightmost-leftmost-1));
//         }
//         return maxArea;
//     }
// }

class Solution {
    public int largestRectangleArea(int[] heights){
        int ns[] = findNextSmaller(heights);
        int ps[] = findPrevSmaller(heights);
        int maxArea = Integer.MIN_VALUE;

        for(int i=0;i<heights.length;i++){
            int h = heights[i];
            int w = ns[i]-ps[i]-1;
            maxArea = Math.max(maxArea,h*w);
        }
        return maxArea;
    }

    public static int[] findNextSmaller(int heights[]){
        int n = heights.length;

        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        for(int i=n-1;i>=0;i--){
            
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = n; 
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] findPrevSmaller(int heights[]){
        int n = heights.length;

        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1; 
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
