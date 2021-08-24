package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongIntToIntFunction {
    int value(long first, int second);

    default LongToIntFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
