class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(isOpening(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(!isBalamced(stack.peek(),ch)){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
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
