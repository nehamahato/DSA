class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(!stackS.isEmpty()) stackS.pop();
            }
            else{
                stackS.push(ch);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(!stackT.isEmpty()) stackT.pop();
            }
            else{
                stackT.push(ch);
            }
        }

        return stackS.equals(stackT);   
    }
}