class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
        public Node(){}
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        head = new Node();
        tail = head;
        size = 0;
    }
    
    public int get(int index) {
        if(index>=size)
            return -1;
        if(index==size-1)
            return tail.val;
        Node curr =  head.next;
        for(int i=0;i<index;i++)
            curr = curr.next;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node curr = new Node(val);
        curr.next = head.next;
        head.next = curr;
        if(size==0)
            tail = curr;
        size++;
    }
    
    public void addAtTail(int val) {
        Node curr = new Node(val);
        tail.next = curr;
        tail = tail.next;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)
            return;
        else if(index==0)
            addAtHead(val);
        else if(index==size)
            addAtTail(val);
        else
        {
            Node temp = new Node(val);
            Node curr = head;
            for(int i=0;i<index;i++)
                curr = curr.next;
            temp.next = curr.next;
            curr.next = temp;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
         if(index>=size)
            return;
        Node curr = head;
        for(int i=0;i<index;i++)
            curr = curr.next;
        if(curr.next==tail)
        {
            curr.next = null;
            tail = curr;
        }
        else
            curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */