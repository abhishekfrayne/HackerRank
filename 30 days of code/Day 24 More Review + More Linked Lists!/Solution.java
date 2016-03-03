    // for sorted only
    /*public static Node removeDuplicates(Node head) {
        //Write your code here
        if(head == null || head.next == null)
            return head;
 
        Node prev = head;    
        Node p = head.next;
 
        while(p != null){
            if(p.data == prev.data){
                prev.next = p.next;
                // move to next node
                p = p.next;
                //no change prev
            }else{
                prev = p;
                // move to next node
                p = p.next; 
            }
        }
 
        return head;
    }*/

    // for sorted and unsorted
    public static Node removeDuplicates(Node head) {
        Hashtable<Boolean, Integer> ht = new Hashtable<>();
		if(head==null || head.next == null){
			return head;
        }
		Node curr = head.next;
		Node prev = head;
		while(curr!=null){
			int data = curr.data;
			if(ht.contains(data)){
				prev.next = curr.next;
			}else{
				ht.put(true, data);
				prev = curr;
			}
            curr = curr.next;
		}
        
        // if a linkedlist contains multiples duplicate,
        // it will print 2 node with same value.
        // For example : 4->5->5->5->5 will print 5 5
        //Thus, this method handles this particular case
        if(head.data == head.next.data){
            head.next = null;
        }
        return head;
    }