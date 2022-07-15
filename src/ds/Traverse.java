package ds;

public class Traverse<T extends Comparable<T>> {

	public void traverse(LinkedListNode<T> head) {
		LinkedListNode<T> current = head;
		while(current != null) {
			System.out.print(head.data + "->");
			current = current.next;
		}
		System.out.println();
	}
}
