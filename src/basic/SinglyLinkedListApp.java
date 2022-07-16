package basic;

import ds.LinkedList;
import ds.Person;

public class SinglyLinkedListApp {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();

		names.insertBegining("Alpha");
		names.insertBegining("Alpha1");
		names.insertEnd("Beta");
		names.insertEnd("Beta2");

		names.traverse();

		names.remove("Beta2");

		names.traverse();

		System.out.println(names.size());

		LinkedList<Person> people = new LinkedList<Person>();

		Person person1 = new Person("Adam", 20);
		people.insertBegining(person1);
		people.insertEnd(new Person("Alpha", 21));
		people.traverse();
		people.remove(person1);
		people.traverse();
	}

}
