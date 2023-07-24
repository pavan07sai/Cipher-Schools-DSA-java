
void removeLoop(Node listNode, Node loopNode){
    Node temp = loopNode;
    while(){
        while(loopNode.next!=listNode.next && loopNode!=temp){
            loopNode = loopNode.next;
        }
        if(listNode.next==loopNode.next){
            loopNode.next = null;
            return;
        }
        listNode=listNode.next;
    }
}


void removeLoop(Node listNode, Node loopNode){
    Node temp = loopNode;
    int size = 1;
    while(loopNode.next!=temp){
        loopNode = loopNode.next;
        size++;
    }
    Node slow = head;
    Node fast = head;
    for(int i=0;i<size;i++){
        fast = fast.next;
    }
    while(slow.next!=fast.next){
        slow = slow.next;
        fast = fast.next;
    }
    fast.next = null;
}



void detectAndremoveLoop(Node head){
    if(head==null)return;
    Node slow = head;
    Node fast = head;
    while(slow.next!=fast.next){
        slow = slow.next;
        fast = fast.next;
        if(slow==fast){
            break;
        }
    }
    if(slow==fast){
        slow=head;
        while(slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}