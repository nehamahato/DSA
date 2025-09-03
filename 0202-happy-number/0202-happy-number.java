class Solution {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = square(n);

        while(fast!=1 && slow!=fast){
            slow = square(slow);
            fast = square(square(fast));
        }
        return fast == 1;   
    }

    public int square(int num){
        int totalnumSq = 0;
        while(num>0){
            int d = num%10;
            num = num/10;
            totalnumSq += d*d;
        }
        return totalnumSq;
    }
}

// class Solution {
//     public boolean isHappy(int n) {
//         HashSet<Integer> seen = new HashSet<>();

//         while(n!=1 && !seen.contains(n)){
//             seen.add(n);
//             n = square(n);
//         }
//         return n == 1;
//     }

//     public int square(int num){
//         int totalnumSq = 0;
//         while(num>0){
//             int d = num%10;
//             num = num/10;
//             totalnumSq += d*d;
//         }
//         return totalnumSq;
//     }
// }    

