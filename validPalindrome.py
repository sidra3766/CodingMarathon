class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        start =0
        end=len(s)-1
        while(start<end):
            left = s[start].lower()
            right = s[end].lower()

            if not left.isalnum():
                start=start+1
                continue
            if not right.isalnum():
                end=end-1
                continue
            if left != right:
                return False

            start=start+1
            end=end-1
            
        return True
