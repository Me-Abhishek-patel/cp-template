package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntCharToLongFunction {
    long value(int first, char second);

    default IntToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
