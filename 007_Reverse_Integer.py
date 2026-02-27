'''
LeetCode Problem: 7. Reverse Integer
Difficulty: Medium

Approach:
- Determine the sign of the number.
- Work with absolute value of the number.
- Extract digits using modulo (%) operator.
- Build reversed number digit by digit.
- Restore original sign.
- Check for 32-bit signed integer overflow.
- If overflow occurs, return 0.

Time Complexity: O(log10(n))
Space Complexity: O(1)

Author: Hamida Badamdi


'''

class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """

        rev_num=0
        sign = -1 if x < 0 else 1
        x = abs(x)
        
        while x > 0:
                digit=x % 10
                rev_num = rev_num * 10 + digit
                x//=10
        rev_num*=sign 

        if rev_num < -2 ** 31 or rev_num > 2 ** 31 -1:
            return 0
        
        return rev_num
