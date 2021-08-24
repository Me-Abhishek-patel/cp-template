package net.cplibrary.generated.collections.set;

import net.cplibrary.generated.collections.IntCollection;

public interface IntSet extends IntCollection {
    @Override
    default int count(int value) {
        return contains(value) ? 1 : 0;
    }
}
