class Solution {
    public static int removeDuplicates(int[] nums) {
        /*HashSet<Integer> h= new HashSet<Integer>();
        int c = nums.length;
        for(int i=0;i<c;i++)
        {
            if(!h.contains(nums[i]))
            {
                h.add(nums[i]);
            }
        }
        int a=h.size();
        System.out.println(a);
        return a;*/
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1&&nums[i]==nums[i+1])
            {
                continue;
            }
            else
            {
                nums[sum]=nums[i];
                sum=sum+1;
            }
        }
        return sum;
    }
}