package basic;

import ds.ListNode;
import ds.Traversal;

public class MergeSortedLists2 {

	private ListNode merge(ListNode A, ListNode B) {
		ListNode head = new ListNode(0);
		ListNode result = head;

		while (true) {

			if (A == null) {
				head.next = B;
				break;
			}

			if (B == null) {
				head.next = A;
				break;
			}

			if (A.data < B.data) {
				head.next = A;
				A = A.next;
			}
			else {
				head.next = B;
				B = B.next;
			}
			head = head.next;
		}

		return result.next;
	}

	public static void main(String[] args) {

		ListNode A = new ListNode(1);
		A.next = new ListNode(3);
		A.next.next = new ListNode(5);
		ListNode B = new ListNode(2);
		B.next = new ListNode(4);

		Traversal.traverse(A);
		Traversal.traverse(B);

		MergeSortedLists2 obj = new MergeSortedLists2();

		ListNode result = obj.merge(A, B);
		Traversal.traverse(result);

	}

}
