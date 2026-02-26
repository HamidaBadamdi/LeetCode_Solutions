'''
LeetCode Problem: 136. Single Number
Difficulty: Easy

Approach:
- Use XOR operation.
- a ^ a = 0
- a ^ 0 = a
- Duplicate numbers cancel out.
- Final result stores the unique number.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Hamida Badamdi

'''
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        for i in nums:
            res^=i
        
        return res
