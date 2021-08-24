package net.cplibrary.generated.collections.iterator;

import java.util.NoSuchElementException;

/**
 * @author Egor Kulikov
 */
public interface CharIterator {
    char value() throws NoSuchElementException;

    /**
     * Returns true if next call to isValid will return true
     */
    boolean advance();

    boolean isValid();

    void remove();
}
