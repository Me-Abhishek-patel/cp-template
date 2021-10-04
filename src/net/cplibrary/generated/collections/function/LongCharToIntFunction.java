package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongCharToIntFunction {
    int value(long first, char second);

    default LongToIntFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
