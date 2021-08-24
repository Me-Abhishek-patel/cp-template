package net.cplibrary.generated.collections.set;

import net.cplibrary.generated.collections.DoubleCollection;

public interface DoubleSet extends DoubleCollection {
    @Override
    default int count(double value) {
        return contains(value) ? 1 : 0;
    }
}
