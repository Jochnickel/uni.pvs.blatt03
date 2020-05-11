package de.jj22.uni.pvs.blatt03;

import java.util.HashMap;

public class HashMapArray<V> {

	final private HashMap<Integer, V> hMap;
	final private int length;

	public HashMapArray(int length) {
		hMap = new HashMap<Integer, V>(length);
		this.length = length;
	}

	public void setEntry(int position, V value) {
		if (getLength() <= position || 0 > position) {
			throw new IndexOutOfBoundsException();
		}
		hMap.put(position, value);
	}

	public V getEntry(int position) {
		if (getLength() <= position || 0 > position) {
			throw new IndexOutOfBoundsException();
		}
		return hMap.get(position);
	}

	public int getLength() {
		return length;
	}

}