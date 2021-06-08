package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongCharToCharFunction {
    char value(long first, char second);

    default LongToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
