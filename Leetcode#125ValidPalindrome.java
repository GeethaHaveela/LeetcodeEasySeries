class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        String str="";char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            str=ch+str;
        }
        System.out.println(str);;
        if(s.equals(str))
        return true;
        else
        return false;
    }
}