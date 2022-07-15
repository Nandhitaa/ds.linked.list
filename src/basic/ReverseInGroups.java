package basic;

import ds.ListNode;
import ds.Traversal;

public class ReverseInGroups {

	public int len(ListNode head) {
		ListNode curr = head;
		int len = 0;

		while (curr != null) {
			len++;
			curr = curr.next;
		}

		return len;
	}

	public ListNode[] reverse(ListNode leftNode, int k) {
		ListNode[] result = new ListNode[2];
		ListNode prev = null;
		ListNode curr = leftNode;
		ListNode next = curr.next;

		while (k > 0) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			k--;
		}

		result[0] = prev;
		result[1] = curr;

		return result;
	}

	public ListNode reverseInGroups(ListNode head, int k) {
		ListNode beforeLeftNode = null;
		ListNode leftNode = head;

		int len = len(head);
		
		for(int i=0; i<len/k; i++) {
			ListNode[] result = reverse(leftNode, k);
			ListNode rightNode = result[0];
			ListNode afterRightNode = result[1];
			
			if(i == 0) {
				head = rightNode;
			}
			else {
				beforeLeftNode.next = rightNode;
			}
			beforeLeftNode = leftNode;
			leftNode = afterRightNode;
			beforeLeftNode.next = leftNode;
		}
		
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
//		ListNode node6 = new ListNode(6);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
//		node5.next = node6;

		ReverseInGroups obj = new ReverseInGroups();
		Traversal.traverse(head);
		head = obj.reverseInGroups(head, 2);
		Traversal.traverse(head);
	}

}
