class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0;int res=0;
        for(int high=0;high<s.length();high++){
            char right=s.charAt(high);
            map.put(right,map.getOrDefault(right,0)+1);
            int k=high-low+1;
            while(map.size()<k){
                char left=s.charAt(low);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0)
                map.remove(left);
                low++;
                k=high-low+1;
            }
            int len=high-low+1;
            res=Math.max(res,len);
            
        }
        return res;
    }
}