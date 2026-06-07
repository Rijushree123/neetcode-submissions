/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        if(head == null ) return null;
        Node newNode = new Node(head.val);
        Node newHead = newNode; 
        map.put(head, newHead);
        Node oldHead = head.next;
        while(oldHead!=null){
            newHead.next = new Node(oldHead.val);
            newHead = newHead.next;
            map.put(oldHead, newHead);
            oldHead = oldHead.next;
        }
        oldHead = head;
        newHead = newNode;
        while(oldHead!=null){
            if(oldHead.random!=null){
                newHead.random = map.get(oldHead.random);
            }
            oldHead = oldHead.next;
            newHead = newHead.next;
        }
        return newNode;
    }
}
