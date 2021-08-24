package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleIntToCharFunction {
    char value(double first, int second);

    default DoubleToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
