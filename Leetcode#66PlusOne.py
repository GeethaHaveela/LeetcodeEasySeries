class Solution(object):
    def plusOne(self, digits):
        a=len(digits)
        b=a-1
        i=0
        sum=0
        while(i<len(digits)):
            sum=sum+(digits[i]*(10**b))
            b=b-1
            i=i+1
        result=sum+1
        l=[]
        while(result>0):
            d=result%10
            l.append(d)
            result=result//10
        results=l[::-1]    
        return results