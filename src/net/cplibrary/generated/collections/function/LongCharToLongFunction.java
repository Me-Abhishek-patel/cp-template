package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongCharToLongFunction {
    long value(long first, char second);

    default LongToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
