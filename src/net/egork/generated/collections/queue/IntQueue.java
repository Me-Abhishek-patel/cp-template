package net.egork.generated.collections.queue;

import net.egork.generated.collections.IntCollection;

public interface IntQueue extends IntCollection {
    default int first() {
        return peek();
    }

    int peek();

    int poll();
}
