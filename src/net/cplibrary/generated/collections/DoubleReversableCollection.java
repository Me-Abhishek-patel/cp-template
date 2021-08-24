package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.DoubleIterator;

public interface DoubleReversableCollection extends DoubleCollection {
    //abstract
    DoubleIterator reverseIterator();

    //base
    default double last() {
        return reverseIterator().value();
    }

    default DoubleStream reversed() {
        return () -> reverseIterator();
    }
}
