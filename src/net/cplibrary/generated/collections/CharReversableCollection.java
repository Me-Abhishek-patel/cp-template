package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.CharIterator;

public interface CharReversableCollection extends CharCollection {
    //abstract
    CharIterator reverseIterator();

    //base
    default char last() {
        return reverseIterator().value();
    }

    default CharStream reversed() {
        return () -> reverseIterator();
    }
}
