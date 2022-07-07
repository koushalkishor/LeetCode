import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            prefix=commonprefix(prefix,strs[i]);
        }
        return prefix;
    }
    public static String commonprefix(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        String hlo="";
        int hl=Math.min(n,m);
        int i=0;
        int j=0;
        while((i<hl) || (j<hl)){
            if(s1.charAt(i)!=s2.charAt(j)){
                break;
            }
            hlo=hlo+s1.charAt(i);
            i++;
            j++;
        }
        return hlo;
    }
}