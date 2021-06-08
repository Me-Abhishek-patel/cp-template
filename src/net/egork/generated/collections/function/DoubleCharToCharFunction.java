package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleCharToCharFunction {
    char value(double first, char second);

    default DoubleToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
