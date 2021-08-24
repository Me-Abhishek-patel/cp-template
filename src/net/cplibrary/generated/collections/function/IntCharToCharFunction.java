package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntCharToCharFunction {
    char value(int first, char second);

    default IntToCharFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToCharFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
