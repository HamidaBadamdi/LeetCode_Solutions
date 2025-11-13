/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
 
    int ListNode *ptr1 , ListNode *ptr2;
    int rev;

    ptr1 = left;
    ptr2 = right;

    while(left <= right)
    {
        left = ptr2->val;
        right = ptr1->val;

        ptr1 = ptr->next
        left=ptr1->next;
        right = left;

    }

    return ListNode*;