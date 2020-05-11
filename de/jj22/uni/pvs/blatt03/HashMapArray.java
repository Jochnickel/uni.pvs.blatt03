package de.jj22.uni.pvs.blatt03;

import java.util.HashMap;
import java.util.Optional;

import de.jj22.uni.pvs.blatt02.Pair;

public class HashMapArray<V> {
	final private HashMap<Integer, V> hMap = new HashMap<Integer, V>();


	public void setEntry(int position){
		if (getLength()<=position){
			throw new IndexOutOfBoundsException();
		}
	}

	public V getEntry(int position){
		if (getLength()<=position){
			throw new IndexOutOfBoundsException();
		}
		return null;
	}

	public int getLength(){

	}

}