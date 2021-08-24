package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharLongToIntFunction {
    int value(char first, long second);

    default CharToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
