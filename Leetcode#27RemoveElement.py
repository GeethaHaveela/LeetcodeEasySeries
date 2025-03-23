class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """   
        arr=[]    
        for i in range(len(nums)):
            if(nums[i]==val):
                arr.append(i)
        print(arr)        
        count=0
        for i in range(len(arr)):
            count=count+1
            nums.pop(arr[i])
            if(i!=len(arr)-1):
                arr[i+1]=arr[i+1]-count      
                    


        