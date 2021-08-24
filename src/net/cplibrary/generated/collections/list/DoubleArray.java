package net.cplibrary.generated.collections.list;

import net.cplibrary.generated.collections.DoubleAbstractStream;

public class DoubleArray extends DoubleAbstractStream implements DoubleList {
    private final double[] data;

    public DoubleArray(double[] arr) {
        data = arr;
    }

    public int size() {
        return data.length;
    }

    public double get(int at) {
        return data[at];
    }

    public void addAt(int index, double value) {
        throw new UnsupportedOperationException();
    }

    public void removeAt(int index) {
        throw new UnsupportedOperationException();
    }

    public void set(int index, double value) {
        data[index] = value;
    }
}
