class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        int res=1;
        while(j<n){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            else{
                i++;
                nums[i]=nums[j];
                res++;
                j++;
            }
        }
        return res;
        
    }
}