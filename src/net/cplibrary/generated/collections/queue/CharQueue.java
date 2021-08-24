package net.cplibrary.generated.collections.queue;

import net.cplibrary.generated.collections.CharCollection;

public interface CharQueue extends CharCollection {
    default char first() {
        return peek();
    }

    char peek();

    char poll();
}
