package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharIntToIntFunction {
    int value(char first, int second);

    default CharToIntFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToIntFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
