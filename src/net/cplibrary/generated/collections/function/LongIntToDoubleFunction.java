package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongIntToDoubleFunction {
    double value(long first, int second);

    default LongToDoubleFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToDoubleFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
