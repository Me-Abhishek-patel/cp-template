package net.egork.generated.collections.queue;

import net.egork.generated.collections.LongCollection;

public interface LongQueue extends LongCollection {
    default long first() {
        return peek();
    }

    long peek();

    long poll();
}
