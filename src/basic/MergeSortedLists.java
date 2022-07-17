package basic;

import ds.ListNode;
import ds.Traversal;

public class MergeSortedLists {

	private ListNode merge(ListNode A, ListNode B) {
		ListNode dummy = new ListNode(0);
		ListNode result = dummy;

		while (A != null && B != null) {
			if (A.data < B.data) {
				dummy.next = A;
				A = A.next;
			}
			else {
				dummy.next = B;
				B = B.next;
			}
			dummy = dummy.next;
		}

		while (A != null) {
			dummy.next = A;
			A = A.next;
			dummy = dummy.next;
		}

		while (B != null) {
			dummy.next = B;
			B = B.next;
			dummy = dummy.next;
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

		MergeSortedLists obj = new MergeSortedLists();

		ListNode result = obj.merge(A, B);
		Traversal.traverse(result);

	}

}
