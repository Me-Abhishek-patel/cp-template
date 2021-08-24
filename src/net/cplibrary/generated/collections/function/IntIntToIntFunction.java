package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntIntToIntFunction {
    int value(int first, int second);

    default IntToIntFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToIntFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
