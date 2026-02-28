'''
LeetCode Problem: 20. Valid Parentheses
Difficulty: Easy
Topic: Stack

Approach:
- Use a stack to keep track of opening brackets.
- Traverse each character in the string.
- Push opening brackets into the stack.
- For closing brackets:
    . Check if stack is empty → invalid
    . Check top element matches corresponding opening bracket
    . Pop if matched
- After traversal, stack must be empty for valid parentheses.

Time Complexity: O(n)
Space Complexity: O(n)

Author: Hamida Badamdi

'''


class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = []

        for ch in s:
            if ch in "({[":
                stack.append(ch)
            else:
                if len(stack) == 0:
                    return False
                else:
                    if ((stack[-1] == '(' and ch == ')') or
                        (stack[-1] == '{' and ch == '}') or
                        (stack[-1] == '[' and ch == ']')):
                        
                        stack.pop()
                    else:
                        return False

        return len(stack) == 0



        
