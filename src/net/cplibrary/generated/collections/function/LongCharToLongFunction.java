package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongCharToLongFunction {
    long value(long first, char second);

    default LongToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
