class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int max_diff=Integer.MAX_VALUE;
        int res_sum=0;

        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int s=nums[left]+nums[right]+nums[i];
                int diff= Math.abs(target-s);
                if(diff<max_diff){
                    max_diff=diff;
                    res_sum=s;
                }
                if(s==target) return s;
                else if(s<target) left++;
                else right--;
            }
        }
        return res_sum;
        
    }
}