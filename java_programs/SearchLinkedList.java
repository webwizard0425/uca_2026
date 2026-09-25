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
class SearchLinkedList {
    public boolean searchList(ListNode list1, ListNode list2) {
      
        if (list1 == null) {
            return true;
        }
       
        ListNode curr2 = list2;
        while (curr2 != null) {
            ListNode p1 = list1;
            ListNode p2 = curr2;
            
        
            while (p1 != null && p2 != null && p1.val == p2.val) {
                p1 = p1.next;
                p2 = p2.next;
            }
            
           
            if (p1 == null) {
                return true;
            }
            

            curr2 = curr2.next;
        }
        
        return false;
    }
}



