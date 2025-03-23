import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int a=strs.length;
        if(a==0)
            return "";
        if(a==1)
            return strs[0];
        Arrays.sort(strs);
        int n=Math.min(strs[0].length(),strs[a-1].length());
        int i=0;
        while(i<n&&strs[0].charAt(i)==strs[a-1].charAt(i))
            i++;
        String s=strs[0].substring(0,i);
        return s;
    }
}
class Result
{
    public static void main(String args[])
    {
        Solution bc=new Solution();
        String[] b={"haveela","hamsa","harshi"};
        System.out.println(bc.longestCommonPrefix(b));
    }
}