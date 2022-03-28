class Solution {
    public int longestValidParentheses(String s) {
         Stack<Character> stack=new Stack<>();
        Stack<Integer>  st=new Stack<>();
        int count=0;
        st.push(-1);
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isOpening(ch)){
                stack.push(ch);
                st.push(i);
            }else{
                if(stack.isEmpty()){
                    st.push(i);
                }else if(isBalamced(stack.peek(),ch)){
                    stack.pop();
                    st.pop();
                    count=Math.max(count,i-st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return count;
    }
//
    private boolean isBalamced(Character peek, char ch) {
        if((peek=='(' && ch==')') || (peek=='{' && ch=='}') || (peek=='[' && ch==']')){
            return true;
        }
        return false;
    }

    private boolean isOpening(char ch) {
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }
}
