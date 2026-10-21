import java.util.*;
class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int ans=0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int s=arr[i]+arr[left]+arr[right];
            if(s>=sum) right--;
            else{
                ans+=right-left;
                left++;
            }
            }
        }
        return ans;
    }
}
