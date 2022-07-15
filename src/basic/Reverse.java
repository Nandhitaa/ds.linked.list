package basic;

import ds.ListNode;
import ds.Traversal;

public class Reverse {

	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head.next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		Reverse obj = new Reverse();
		Traversal.traverse(head);
		head = obj.reverse(head);
		Traversal.traverse(head);
	}

}
