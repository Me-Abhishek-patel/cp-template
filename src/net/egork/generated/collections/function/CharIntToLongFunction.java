package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharIntToLongFunction {
    long value(char first, int second);

    default CharToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
