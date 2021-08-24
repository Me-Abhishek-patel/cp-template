package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntDoubleToDoubleFunction {
    double value(int first, double second);

    default IntToDoubleFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
