package net.egork.collections.set;

import java.util.NavigableSet;

/**
 * @author Egor Kulikov (kulikov@devexperts.com)
 */
public interface PersistentSet<K> extends NavigableSet<K> {
    void markState(Object marker);

    PersistentSet<K> getState(Object marker);
}
