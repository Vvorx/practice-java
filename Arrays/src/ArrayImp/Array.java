package ArrayImp;
// This file contains my implementation of an Array

public class Array<T> {

    private T[] array;
    private int initSize;
    private int currentSize;

    public Array(int initSize) {
        this.array = (T[]) new Object[initSize];
    }

    public T[] addElement(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                break;
            }
        }
        return array;
    }

    public T[] getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+array[i]+"] ");
        }
        return array;
    }
}
