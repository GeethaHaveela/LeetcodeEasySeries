class Solution {
    public boolean isPalindrome(int x) {
       String s= Integer.toString(x);
       String s1=new String();
       char a;
       for(int i=s.length()-1;i>=0;i--)
       {
        a=s.charAt(i);
        s1=s1+a;
       }
       if(s1.equals(s))
        return true;
       else
        return false;
    }
}