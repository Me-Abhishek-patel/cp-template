package net.cplibrary.collections.set;

import java.util.NavigableSet;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface PersistentSet<K> extends NavigableSet<K> {
    void markState(Object marker);

    PersistentSet<K> getState(Object marker);
}
