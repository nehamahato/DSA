// class Solution {
//     public boolean backspaceCompare(String s, String t) {

//         Stack<Character> stackS = new Stack<>();
//         Stack<Character> stackT = new Stack<>();

//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(ch == '#'){
//                 if(!stackS.isEmpty()) stackS.pop();
//             }
//             else{
//                 stackS.push(ch);
//             }
//         }

//         for(int i=0;i<t.length();i++){
//             char ch = t.charAt(i);
//             if(ch == '#'){
//                 if(!stackT.isEmpty()) stackT.pop();
//             }
//             else{
//                 stackT.push(ch);
//             }
//         }

//         return stackS.equals(stackT);   
//     }
// }

class Solution {
     public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;

        while(i>=0 || j>=0){
            int skipS = 0;
            int skipT = 0;
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skipS++;
                    i--;
                }
                else if(skipS>0){
                    skipS--;
                    i--;
                }
                else{
                    break;
                }
            }

            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipT++;
                    j--;
                }
                else if(skipT>0){
                    skipT--;
                    j--;
                }
                else{
                    break;
                }
            }

            if(i>=0 && j>=0 &&s.charAt(i)!=t.charAt(j)){
                return false;
            }

            if((i>=0)!=(j>=0)){
                return false;
            }

            i--;
            j--;
        }
        return true;
    }
}    