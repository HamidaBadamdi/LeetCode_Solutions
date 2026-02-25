'''
LeetCode Problem: 125. Valid Palindrome
Difficulty: Easy

Approach:
- Use two pointers (left and right).
- Skip non-alphanumeric characters.
- Compare characters ignoring case.
- Move pointers inward.
- If mismatch found, return False.
- If loop completes, return True.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Hamida Badamdi

'''

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        left=0
        right=len(s) -1 

        while left < right:
            while left < right and not s[left].isalnum():
                left+=1
            
            while left < right and not s[right].isalnum():
                right-=1

            if s[left].lower() != s[right].lower():
                return False

            left+=1
            right-=1

        return True

        
