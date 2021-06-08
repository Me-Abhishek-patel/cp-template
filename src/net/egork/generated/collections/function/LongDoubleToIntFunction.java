package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongDoubleToIntFunction {
    int value(long first, double second);

    default LongToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
