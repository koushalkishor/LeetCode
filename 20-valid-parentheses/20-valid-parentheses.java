class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isOpening(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(!isBalanced(stack.peek(),ch)){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isOpening(char c){
        if(c=='(' || c=='{' || c=='['){
            return true;
        }
        return false;
    }
    public static boolean isBalanced(char peek,char ch){
         if((peek=='(' && ch==')') || (peek=='{' && ch=='}') || (peek=='[' && ch==']')){
            return true;
        }
        return false;
    }
}