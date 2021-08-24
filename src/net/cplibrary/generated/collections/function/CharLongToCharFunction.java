package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharLongToCharFunction {
    char value(char first, long second);

    default CharToCharFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToCharFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
