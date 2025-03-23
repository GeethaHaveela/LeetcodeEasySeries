class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        z=0
        flag=0
        for i in range(len(haystack)-len(needle)+1):
            if(needle[0]==haystack[i] and len(haystack)>=len(needle)):
                l1=''
                l2=''
                for k in range(len(needle)):
                    l1=l1+(needle[k])
                    l2=l2+(haystack[i+k])
                print(l1,l2)    
                if(l1==l2):
                    flag=1
                    z=z+i
                    break  
        if (flag==1):
            return z
        else:
            return -1                          





        