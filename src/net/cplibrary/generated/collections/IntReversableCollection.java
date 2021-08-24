package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.IntIterator;

public interface IntReversableCollection extends IntCollection {
    //abstract
    IntIterator reverseIterator();

    //base
    default int last() {
        return reverseIterator().value();
    }

    default IntStream reversed() {
        return () -> reverseIterator();
    }
}
