package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharLongToDoubleFunction {
    double value(char first, long second);

    default CharToDoubleFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
