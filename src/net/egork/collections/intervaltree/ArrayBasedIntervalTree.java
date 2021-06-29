package net.egork.collections.intervaltree;

/**
 * @author Egor Kulikov (Abhishek Patel (abhishekpatelmrj@gmail.com))
 */
public abstract class ArrayBasedIntervalTree extends LongIntervalTree {
    private final long[] array;

    protected ArrayBasedIntervalTree(long[] array) {
        super(array.length, false);
        this.array = array;
        init();
    }

    @Override
    protected long initValue(int index) {
        return array[index];
    }
}