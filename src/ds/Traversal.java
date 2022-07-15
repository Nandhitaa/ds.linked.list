package ds;

public class Traversal {

	public static void traverse(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();
	}
}
