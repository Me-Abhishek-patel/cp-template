package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntIntToDoubleFunction {
    double value(int first, int second);

    default IntToDoubleFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
