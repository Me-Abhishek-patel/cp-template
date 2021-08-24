package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongCharToIntFunction {
    int value(long first, char second);

    default LongToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
