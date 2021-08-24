package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleIntToLongFunction {
    long value(double first, int second);

    default DoubleToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
