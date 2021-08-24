package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleDoubleToCharFunction {
    char value(double first, double second);

    default DoubleToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
