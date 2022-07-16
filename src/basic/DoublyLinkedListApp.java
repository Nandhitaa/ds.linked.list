package basic;

import ds.DoublyLinkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) {

		DoublyLinkedList<String> names = new DoublyLinkedList<String>();

		names.insertEnd("Adam1");
		names.insertEnd("Adam2");
		names.insertEnd("Adam3");

		names.traverseForward();
		names.traverseBackward();
		System.out.println(names.size());

		names.remove("Adam1");

		names.traverseForward();
		names.traverseBackward();
		System.out.println(names.size());
	}

}
