class Solution {
    public int romanToInt(String s) {
        int result=0;
        int i=0;
        int current,next;
        int n=s.length();
        while(i<n){
            if(i==n-1){
                result=result+getInteger(s.charAt(i));
                return result;
            }
            current=getInteger(s.charAt(i));
            next=getInteger(s.charAt(i+1));
            if(current>=next){
                result+=current;
                i+=1;
            }
            else{
                result+=(next-current);
                i+=2;
            }
        }
        return result;
        }
    public int getInteger(char c){
        switch(c){
            case'I':
                return 1;
            case'V':
                return 5;
            case'X':
                return 10;
            case'L':
                return 50;
            case'C':
                return 100;
            case'D':
                return 500;
            case'M':
                return 1000;
            default:
                return -1;
        }
    }
    }
