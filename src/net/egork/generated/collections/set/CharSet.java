package net.egork.generated.collections.set;

import net.egork.generated.collections.CharCollection;

public interface CharSet extends CharCollection {
    @Override
    default int count(char value) {
        return contains(value) ? 1 : 0;
    }
}
