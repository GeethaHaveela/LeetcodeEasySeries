class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        int count1=0;
        char[] ch=s.toCharArray();  
      for(int i=n-1;i>=0;i--)
      {
          if(ch[i]!=' ')
          {
              count1=count1+1;
          }
          if(count1>0)
          {
              if(ch[i]==' ')
              {
                  break;
              }
              else
              {
                  count=count+1;
              }
          }
      } 
      return count;  
    }
    public static void main(String args[])
    {
        String a="hello world";
        Solution s=new Solution();
        s.lengthOfLastWord(a); 
    }
}