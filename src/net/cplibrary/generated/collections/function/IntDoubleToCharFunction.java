package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntDoubleToCharFunction {
    char value(int first, double second);

    default IntToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
