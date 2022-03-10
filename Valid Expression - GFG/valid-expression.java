// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


class Solution 
{ 
    boolean valid(String s) 
    { 
        Stack<Character> st = new Stack<Character>();
        
       for(int i =0;i<s.length();i++){
           char x = s.charAt(i);
           if(x=='(' || x=='{' || x=='[')
          {
                 st.push(x);
                 continue;
          }
          if(st.isEmpty())
          return false;
          
          char ch;
         switch(x){
             case ')' : {
                 ch = st.pop();
                 if(ch=='[' || ch =='{')
                 return false;
                 break;
                 
             }
             case '}' :{
                 ch = st.pop();
                 if(ch=='(' || ch == '[')
                 return false;
                 break;
                 
             }
             case ']' : {
                 ch = st.pop();
                 if(ch == '{' || ch == '(')
                 return false;
                 break;
                 
             }
         }
             
       }
       return st.isEmpty();
    }
} 