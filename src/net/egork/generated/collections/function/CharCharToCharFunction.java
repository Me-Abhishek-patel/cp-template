package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharCharToCharFunction {
    char value(char first, char second);

    default CharToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
