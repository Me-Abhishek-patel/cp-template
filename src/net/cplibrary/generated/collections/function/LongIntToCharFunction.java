package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongIntToCharFunction {
    char value(long first, int second);

    default LongToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
