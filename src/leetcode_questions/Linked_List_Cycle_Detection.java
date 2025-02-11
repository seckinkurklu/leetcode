package leetcode_questions;

public class Linked_List_Cycle_Detection {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && slow != null){

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }

        }
        return false;


    }

}
