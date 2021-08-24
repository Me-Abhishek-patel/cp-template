package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleIntToIntFunction {
    int value(double first, int second);

    default DoubleToIntFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToIntFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
