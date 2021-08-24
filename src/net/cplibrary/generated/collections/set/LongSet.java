package net.cplibrary.generated.collections.set;

import net.cplibrary.generated.collections.LongCollection;

public interface LongSet extends LongCollection {
    @Override
    default int count(long value) {
        return contains(value) ? 1 : 0;
    }
}
