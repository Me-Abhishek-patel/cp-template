package net.cplibrary.generated.collections.set;

import net.cplibrary.generated.collections.CharCollection;

public interface CharSet extends CharCollection {
    @Override
    default int count(char value) {
        return contains(value) ? 1 : 0;
    }
}
