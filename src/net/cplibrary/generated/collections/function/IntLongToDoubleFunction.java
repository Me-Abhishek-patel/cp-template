package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntLongToDoubleFunction {
    double value(int first, long second);

    default IntToDoubleFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
