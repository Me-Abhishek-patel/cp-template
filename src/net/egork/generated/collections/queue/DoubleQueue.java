package net.egork.generated.collections.queue;

import net.egork.generated.collections.DoubleCollection;

public interface DoubleQueue extends DoubleCollection {
    default double first() {
        return peek();
    }

    double peek();

    double poll();
}
