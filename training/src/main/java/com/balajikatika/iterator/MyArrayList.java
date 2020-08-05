package com.balajikatika.iterator;

public class MyArrayList<T> implements Containter<T> {

	public class MyArrayListIterator implements Iterator<T> {
		T[] myList;
		int current = 0;

		public MyArrayListIterator(T[] objects) {
			this.myList = objects;
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (current == (myList.length - 1));
		}

		public T getNext() {
			// TODO Auto-generated method stub
			return myList[current];
		}

	}

	private T[] objects;

	public MyArrayList() {
		// TODO Auto-generated constructor stub
	}

	public Iterator<T> getIterator() {
		// TODO Auto-generated method stub
		return new MyArrayListIterator(objects);
	}

}
