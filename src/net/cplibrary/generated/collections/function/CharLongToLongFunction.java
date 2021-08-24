package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharLongToLongFunction {
    long value(char first, long second);

    default CharToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
