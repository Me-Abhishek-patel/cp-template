package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntDoubleToIntFunction {
    int value(int first, double second);

    default IntToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
