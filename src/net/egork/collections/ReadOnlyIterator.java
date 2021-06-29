package net.egork.collections;

import java.util.Iterator;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public abstract class ReadOnlyIterator<T> implements Iterator<T> {
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
