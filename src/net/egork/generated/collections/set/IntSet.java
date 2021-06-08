package net.egork.generated.collections.set;

import net.egork.generated.collections.IntCollection;

public interface IntSet extends IntCollection {
    @Override
    default int count(int value) {
        return contains(value) ? 1 : 0;
    }
}
