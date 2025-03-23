class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        def num(n):
            z=len(n)-1
            sum=0
            c=0
            for i in range(z,-1,-1):
                sum=sum+(int(n[i])*(2**c))
                c=c+1
            return sum
        a1=num(a)
        b1=num(b)
        res=a1+b1
        l=''
        while(res>=1):
            z=res%2
            l=l+str(z)
            res=res//2
        l=l[::-1]
        if(len(l)==0):
            return '0'
        else:
            return l    

        
        