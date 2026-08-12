import java.util.*;

class mergeK_Sorted_Lists{

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val , ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public ListNode mergeKLists (ListNode[] lists){

        if(lists==null || lists.length==0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                        (a,b) -> Integer.compare(a.val,b.val));

        for( ListNode node : lists){
            if(node!=null) pq.add(node);
                
        }

        ListNode dummy = new ListNode(-1,null);
        ListNode tail = dummy;

        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            tail.next = node;
            tail = node;

             if (node.next != null) {
                pq.add(node.next);
            }
        }
        return dummy.next;
    }
}