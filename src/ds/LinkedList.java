package ds;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private LinkedListNode<T> root;
	private int noOfItems;

	@Override
	public void insertBegining(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if (this.root == null) {
			root = newNode;
		}
		else {
			newNode.setNextNode(root);
			root = newNode;
		}
		noOfItems++;
	}

	@Override
	public void insertEnd(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if(root == null) {
			root = newNode;
		}
		else {
			LinkedListNode<T> current = root;
			while(current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
		noOfItems++;
	}

	@Override
	public void remove(T data) {
		if(root == null) return;
		
		if(root.getData().compareTo(data) == 0) {
			root = root.getNextNode();
			noOfItems--;
		}
		else {
			LinkedListNode<T> prev = null;
			LinkedListNode<T> curr = root;
			while(curr != null) {
				if(curr.getData().compareTo(data) == 0) {
					prev.setNextNode(curr.getNextNode());
					noOfItems--;
					return;
				}
				prev = curr;
				curr = curr.getNextNode();
			}
		}
		
	}

	@Override
	public void traverse() {
		LinkedListNode<T> currentNode = this.root;
		while (currentNode != null) {
			System.out.print(currentNode.toString() + "->");
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}

	@Override
	public int size() {
		return this.noOfItems;
	}

}
