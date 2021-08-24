package net.cplibrary.generated.collections.queue;

import net.cplibrary.generated.collections.LongCollection;

public interface LongQueue extends LongCollection {
    default long first() {
        return peek();
    }

    long peek();

    long poll();
}
