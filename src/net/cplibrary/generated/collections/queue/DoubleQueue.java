package net.cplibrary.generated.collections.queue;

import net.cplibrary.generated.collections.DoubleCollection;

public interface DoubleQueue extends DoubleCollection {
    default double first() {
        return peek();
    }

    double peek();

    double poll();
}
