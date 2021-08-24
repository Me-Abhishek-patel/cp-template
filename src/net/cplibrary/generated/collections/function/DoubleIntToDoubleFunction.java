package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleIntToDoubleFunction {
    double value(double first, int second);

    default DoubleToDoubleFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToDoubleFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
