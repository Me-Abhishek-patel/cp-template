package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntCharToIntFunction {
    int value(int first, char second);

    default IntToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
