package arraylist;

public class ArrayList<E> implements List<E>{

	private int size = 0;
	private E data[];
	public static final int CAPACITY = 16; 		//default capacity
	
	//contructs arraylist with default capacity
	public ArrayList() {
		this(CAPACITY);
	}
	
	//contructs arraylist with user defined capacity
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	@Override
	public int size() {
		return size ;
	}

	
	
	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		if(isEmpty()) {
			System.out.println("Empty array");
		}
		check(i, size);
		E element = data[i];
		return element;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		check(i, size);
		E element = data[i];
		data[i] = e;
		
		return element;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException,IllegalStateException{
		check(i, size+1);
		if(size == data.length)
			throw new IllegalStateException("Array is full");
		
		for(int k = size-1; k >= i; k--) {
			data[k+1] = data[k];			//start shifting to rightmost
			data[i] = e;				//place the element e at i
		}
		size++;
		
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		check(i, size);
		E element = data[i];
		 for (int k = i; k < size-1; k++) {
			 data[k] = data[k+1];			//shift elements to leftmost
			 data[size-1] = null;
			 size--;
		 }
		return element;
	}

	@Override
	public void addnew(E e) {
		if(size == data.length)
			throw new IllegalStateException("Array is full");
		
		data[size] = e;
		size++;
	}
	
	protected void check(int i, int n) {
		if(i < 0 || i >= n) {
			throw new IndexOutOfBoundsException();
		}
	}
}
