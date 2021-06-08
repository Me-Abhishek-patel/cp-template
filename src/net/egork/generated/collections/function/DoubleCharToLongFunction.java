package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleCharToLongFunction {
    long value(double first, char second);

    default DoubleToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
