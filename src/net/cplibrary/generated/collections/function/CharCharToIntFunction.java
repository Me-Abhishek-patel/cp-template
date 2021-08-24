package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharCharToIntFunction {
    int value(char first, char second);

    default CharToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
