package net.egork.generated.collections.set;

import net.egork.generated.collections.DoubleCollection;

public interface DoubleSet extends DoubleCollection {
    @Override
    default int count(double value) {
        return contains(value) ? 1 : 0;
    }
}
