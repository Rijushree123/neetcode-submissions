/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int l=0;
        while(temp!=null){
            temp = temp.next;
            l++;
        }
        System.out.println(l);
        temp = head;
        l = l-n;
        System.out.println(l);
        int c = 1;
        if(l==0) head = head.next;
        else{
        while(temp!=null){
                    if(c==l){
                        temp.next = temp.next.next;
                        break;
                    }
                    temp = temp.next;
                    c++;
                }
        }
        
        return head;
    }
}
