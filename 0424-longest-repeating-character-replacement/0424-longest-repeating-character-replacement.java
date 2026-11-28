class Solution {
    public int characterReplacement(String s, int k) {
        int high=0;int low=0;int res=0;
        int[] arr=new int[26];
        int max=0;
        for(high=0;high<s.length();high++){
            arr[s.charAt(high)-'A']++;
            int len=high-low+1;
             max=Math.max(max,arr[s.charAt(high)-'A']);
            int diff=len-max;
            while(diff>k){
                arr[s.charAt(low)-'A']--;
                low++;
               
                 len=high-low+1;
                 diff=len-max;
            }
        
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}