package net.egork.generated.collections;

import net.egork.generated.collections.iterator.DoubleIterator;

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
