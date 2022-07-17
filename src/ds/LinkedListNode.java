package ds;

public class LinkedListNode<T extends Comparable<T>> {

	private T data;
	private LinkedListNode<T> nextNode;

	public LinkedListNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return data.toString();
	}

}
