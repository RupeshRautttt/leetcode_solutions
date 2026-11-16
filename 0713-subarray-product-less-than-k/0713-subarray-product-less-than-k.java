import java.util.Arrays;
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low=0;
        int product=1;
        int high=0;
        int ans=0;
        if(k<=1) return 0;
        while(high<nums.length){
            product*=nums[high];
            while(product>=k){
                product/=nums[low];
                low++;
            }
            ans+=high-low+1;
            high++;
            
            

        }
        return ans;
    }
}