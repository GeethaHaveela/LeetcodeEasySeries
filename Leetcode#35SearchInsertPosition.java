class Solution {
    public int searchInsert(int[] nums, int target) {
     int n=nums.length;
     int ans;
     int count=0;
     int abs=0,flag=0;
     for(int i=0;i<n;i++)
     {
         if(nums[i]==target)
         {
          abs=abs+i;
         }
     else
     {
        count=count+1;
     }
     }
     if(count==n)
     {
         for(int i=0;i<n;i++)
         {
             if(nums[i]>target)
             {
flag=flag+1;
              abs=abs+i;
              break;
             }
         }
if(flag==0)
{
abs=abs+n;
}
     }
return abs;
    }
    public static void main(String args[])
    {
        Solution s=new Solution();
        int[] nums={1,3,5,6};
        s.searchInsert(nums,2);
    }
}