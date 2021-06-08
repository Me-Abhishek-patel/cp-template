package net.egork.generated.collections.iterator;

import java.util.NoSuchElementException;

/**
 * @author Egor Kulikov
 */
public interface LongIterator {
    long value() throws NoSuchElementException;

    /**
     * Returns true if next call to isValid will return true
     */
    boolean advance();

    boolean isValid();

    void remove();
}
