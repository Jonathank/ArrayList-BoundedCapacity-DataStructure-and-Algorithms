package arraylist;

public interface List<E> {
	//returns size of the list
	int size();
	//returns element at index i
	E get(int i) throws IndexOutOfBoundsException;
	//returns true if list is empty
	boolean isEmpty();
	//sets element e at index i, replaceing the existing element at that index
	E set(int i, E e) throws IndexOutOfBoundsException;
	//adds element e at index i, shifting elements from i to n-1 up
	void add(int i, E e) throws IndexOutOfBoundsException;
	//removes and returns element at index i, shifting all elements down
	E remove(int i) throws IndexOutOfBoundsException;
	//adds new element
	void addnew(E e);
}
