class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        l=[]
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                sum=nums[i]+nums[j]
                print("i",nums[i],"j",nums[j],"sum",sum)
                if(sum==target):
                    l.append(i)
                    l.append(j)
                
                else:
                    sum=0            
        return l