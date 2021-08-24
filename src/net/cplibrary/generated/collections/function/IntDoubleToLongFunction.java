package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntDoubleToLongFunction {
    long value(int first, double second);

    default IntToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
