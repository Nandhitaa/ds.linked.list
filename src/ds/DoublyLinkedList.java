package ds;

public class DoublyLinkedList<T extends Comparable<T>> implements DList<T> {

	private DNode<T> head;
	private DNode<T> tail;
	private int size;

	@Override
	public void insertEnd(T data) {
		DNode<T> newNode = new DNode<T>(data);

		if (tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}

		size++;
	}

	@Override
	public void remove(T data) {
		if (head == null)
			return;

		if (head.equals(tail) && head.getData().compareTo(data) == 0) {
			head = head.getNext();
			tail = head;
			size--;
			return;
		}

		if (head.getData().compareTo(data) == 0) {
			head = head.getNext();
			head.setPrev(null);
			size--;
			return;
		}

		if (tail.getData().compareTo(data) == 0) {
			tail = tail.getPrev();
			tail.setNext(null);
			size--;
			return;
		}

		DNode<T> curr = head;
		while (curr != null) {
			if (curr.getData().compareTo(data) == 0) {
				curr.getPrev().setNext(curr.getNext());
				curr.getNext().setPrev(curr.getPrev());
				size--;
			}
			curr = curr.getNext();
		}

	}

	@Override
	public void traverseForward() {
		DNode<T> curr = this.head;
		while (curr != null) {
			System.out.print(curr.toString() + "->");
			curr = curr.getNext();
		}
		System.out.println();
	}

	@Override
	public void traverseBackward() {
		DNode<T> curr = this.tail;
		while (curr != null) {
			System.out.print(curr.toString() + "<-");
			curr = curr.getPrev();
		}
		System.out.println();
	}

	@Override
	public int size() {
		return this.size;
	}

}
