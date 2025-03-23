import java.util.HashMap;
class Solution {
    public static int sum;
    public static int i;
    public int romanToInt(String s) {
        HashMap<Character,Integer>h=new HashMap<Character,Integer>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        sum=0;
        for(i=0;i<s.length();i++)
        {
            if( i!=s.length()-1 && (s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')))
            {
                sum=sum-1;
            }
            else if(i!=s.length()-1 && (s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')))
            {
                sum=sum-10;
            }
            else if(i!=s.length()-1 && (s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')))   
            {
                sum=sum-100;
            }
            else
            {
                sum=sum+(h.get(s.charAt(i)));
            }
        }
        return sum;
    }
}