package ds;

public class LinkedList<T extends Comparable<T>> {

	public LinkedListNode<T> head;

	public LinkedList(LinkedListNode<T> head) {
		this.head = head;
	}

	public LinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(LinkedListNode<T> head) {
		this.head = head;
	}

}
