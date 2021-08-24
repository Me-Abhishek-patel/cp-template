package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongIntToLongFunction {
    long value(long first, int second);

    default LongToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
