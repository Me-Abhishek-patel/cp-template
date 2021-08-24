package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.LongIterator;

public interface LongReversableCollection extends LongCollection {
    //abstract
    LongIterator reverseIterator();

    //base
    default long last() {
        return reverseIterator().value();
    }

    default LongStream reversed() {
        return () -> reverseIterator();
    }
}
