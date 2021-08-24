package net.cplibrary.generated.collections.queue;

import net.cplibrary.generated.collections.IntCollection;

public interface IntQueue extends IntCollection {
    default int first() {
        return peek();
    }

    int peek();

    int poll();
}
