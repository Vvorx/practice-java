package ArrayImp;
// This file contains my implementation of an Array

public class Array<T> {

    private T[] array;
    private int initSize;
    private int currentSize;

    public Array(int initSize) {
        this.array = (T[]) new Object[initSize];
    }

}
