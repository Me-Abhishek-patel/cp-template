package net.egork.generated.collections.set;

import net.egork.generated.collections.LongCollection;

public interface LongSet extends LongCollection {
    @Override
    default int count(long value) {
        return contains(value) ? 1 : 0;
    }
}
