package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleCharToIntFunction {
    int value(double first, char second);

    default DoubleToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
