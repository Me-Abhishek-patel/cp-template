package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongLongToCharFunction {
    char value(long first, long second);

    default LongToCharFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
