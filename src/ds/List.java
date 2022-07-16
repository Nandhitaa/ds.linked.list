package ds;

public interface List<T> {

	public void insertBegining(T data);

	public void insertEnd(T data);

	public void remove(T data);

	public void traverse();

	public int size();
}
