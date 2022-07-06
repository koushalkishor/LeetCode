class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String prefix=strs[0];
        for(int i=1;i<n;i++){
            prefix=longestprefix(prefix,strs[i]);
        }
        return prefix;
    }
    public static String longestprefix(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        String inal="";
for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++){
                if(str1.charAt(i)!=str2.charAt(j)){
                    break;
                }
            
                inal=inal+str1.charAt(i);
            
        }
        return inal;
    }
}