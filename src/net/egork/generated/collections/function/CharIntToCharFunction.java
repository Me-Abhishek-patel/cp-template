package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharIntToCharFunction {
    char value(char first, int second);

    default CharToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
