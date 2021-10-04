package net.cplibrary.generated.collections.iterator;

import java.util.NoSuchElementException;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleIterator {
    double value() throws NoSuchElementException;

    /**
     * Returns true if next call to isValid will return true
     */
    boolean advance();

    boolean isValid();

    void remove();
}
