class GfG{
    int getNthFromLast(Node head, int n){
        Node slow = head;
        Node fast = head;
        
        for (int i=0;i<n;i++){
            if(fast == null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}

class Solution{
    Node reverseList(Node head){
        Node prev = null;
        Node next = null;
        Node curr =  head;
        while(curr!=null){
            net = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

