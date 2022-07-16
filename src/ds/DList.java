package ds;

public interface DList<T> {

	public void insertEnd(T data);

	public void remove(T data);

	public void traverseForward();
	
	public void traverseBackward();

	public int size();
}
