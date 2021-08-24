package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharDoubleToCharFunction {
    char value(char first, double second);

    default CharToCharFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
