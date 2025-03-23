import java.lang.Math;
import java.util.HashMap;
class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> h =new HashMap<Character,Integer>();
        int k=65;
        System.out.println(columnTitle.length());
        for(int i=1;i<27;i++)
        {
            h.put((char)k,i);
            k=k+1;
        }
        System.out.println(h);
        int z=0,sum=0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            sum=sum+((h.get(columnTitle.charAt(z)))*(int)(Math.pow(26,i)));
            z=z+1;
        }
        return sum;
    }
}