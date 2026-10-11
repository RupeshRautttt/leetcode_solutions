class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=1,j=numbers.length;
        int ans[]=new int[2];
        while(i<j){
            int sum=numbers[i-1]+numbers[j-1];
            if(sum==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
            if(sum<target) i++;
            else if(sum>target) j--;

        }
        return ans;
        
    }
}