package net.egork.generated.collections.queue;

import net.egork.generated.collections.CharCollection;

public interface CharQueue extends CharCollection {
    default char first() {
        return peek();
    }

    char peek();

    char poll();
}
