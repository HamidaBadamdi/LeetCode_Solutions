'''
LeetCode Problem: 1. Two Sum
Difficulty: Easy

Approach:
- Use a dictionary to store visited numbers.
- For each element, check if complement exists.
- Return indices when found.

Time Complexity: O(n)
Space Complexity: O(n)

Author: Hamida Badamdi
'''
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        dict={}
        for i in range(len(nums)):
            cmp=target-nums[i]

            if cmp in dict:
               return [dict[cmp],i]
        
            dict[nums[i]] = i
