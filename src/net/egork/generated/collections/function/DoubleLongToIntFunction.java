package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleLongToIntFunction {
    int value(double first, long second);

    default DoubleToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
