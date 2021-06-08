package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharCharToLongFunction {
    long value(char first, char second);

    default CharToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
