class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0,sum=0;

        int res=Integer.MAX_VALUE;
        int n=nums.length;
        for(high=0;high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                sum-=nums[low];
                int len=high-low+1;
                res=Math.min(res,len);
                low++;
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}