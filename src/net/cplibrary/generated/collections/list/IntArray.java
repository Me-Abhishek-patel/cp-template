package net.cplibrary.generated.collections.list;

import net.cplibrary.generated.collections.IntAbstractStream;

public class IntArray extends IntAbstractStream implements IntList {
    private final int[] data;

    public IntArray(int[] arr) {
        data = arr;
    }

    public int size() {
        return data.length;
    }

    public int get(int at) {
        return data[at];
    }

    public void addAt(int index, int value) {
        throw new UnsupportedOperationException();
    }

    public void removeAt(int index) {
        throw new UnsupportedOperationException();
    }

    public void set(int index, int value) {
        data[index] = value;
    }
}
