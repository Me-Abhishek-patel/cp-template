package net.cplibrary.collections.intervaltree;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
