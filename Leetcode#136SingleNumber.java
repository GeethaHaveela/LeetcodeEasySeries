import java.util.*;
class Solution {
    public static int i;
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
        return nums[0];
        if(nums[0]!=nums[1])
        return nums[0];
        for(i=1;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
            return nums[i];
        }
        System.out.println("i"+i);
        System.out.println(nums[nums.length-1]);
        if(i==nums.length-1 && nums[i-1]!=nums[i])
        return nums[nums.length-1];
        return 0;
    }
}