package genericArray;

public class GenericArray<T> {
	
	private T[] genericArray;
	
	@SuppressWarnings("unchecked")
	public GenericArray (int size) {
		this.genericArray = (T[]) new Object[size];
	}
	
	public T get(int index) {
		return (T) genericArray[index];
	}

	public void set(int index, T value) {
		this.genericArray[index] = value;
	}
	
	public int size() {
		return this.genericArray.length;
	}
	
	public boolean isEmpty() {
	boolean isEmpty;
	if (this.genericArray.length == 0)
		isEmpty = true;
	
	else
		isEmpty = false;
	
	return isEmpty;
	}
}