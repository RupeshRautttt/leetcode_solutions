class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtyspe: int
        """
        d=set()
        l=0
        res=0
        for r in range(len(s)):
            while s[r] in d:
                d.remove(s[l])
                l+=1
            d.add(s[r])
            res=max(res,r-l+1)
        return res
            
        