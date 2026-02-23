'''
LeetCode Problem: 9. Palindrome Number
Difficulty: Easy


Approach:
**Idea**
A palindrome number reads the same forward and backward.
Instead of reversing the number mathematically, we:

1.Convert the integer into a string.
2.Reverse the string using slicing.
3.Compare the original string with the reversed string.
4.If both are equal → it is a palindrome.
5.Otherwise → it is not.

Time Complexity: O(n)
Space Complexity: O(n)

Author: Hamida Badamdi
'''


class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        return str(x)  == str(x)[::-1]
