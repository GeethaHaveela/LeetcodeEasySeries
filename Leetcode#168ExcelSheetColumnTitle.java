import java.util.HashMap;
class Solution {
    public static String s;
    public String convertToTitle(int columnNumber) {
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        int k=65;
        for(int i=1;i<27;i++)
        {
            h.put(i,Character.toString((char)k));
            k=k+1;
        }
        System.out.println(h);
        s="";
        /*if(columnNumber%26!=0)
        {
        s="";
        while(columnNumber>0 && columnNumber%26!=0)
        {
            int a=columnNumber%26;
            s=(h.get(a))+s;
            columnNumber=columnNumber/26;
            System.out.println("1"+columnNumber);
        }
        System.out.println("s1"+s);
        }
        else if(columnNumber%26==0)
        {
            s="Z";
            columnNumber=columnNumber-1;
            columnNumber=columnNumber/26;
            System.out.println("1"+columnNumber);
        while(columnNumber>0)
        {
            System.out.println("2"+columnNumber);
            int a=columnNumber%26;
            s=(h.get(a))+s;
            columnNumber=columnNumber/26;
            System.out.println("3"+columnNumber);
        }
        System.out.println("s2"+s);
        }
        System.out.println("s3"+s);
        if(columnNumber<=26 && columnNumber!=0)
        {
        s=(h.get(columnNumber))+s;
        }*/
        while(columnNumber>0)
        {
            int a=(columnNumber-1)%26;
            s=(char)(a+'A')+s;
            columnNumber=(columnNumber-1)/26;
        }
        return s;
    }
}