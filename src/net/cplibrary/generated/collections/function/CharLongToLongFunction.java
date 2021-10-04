package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharLongToLongFunction {
    long value(char first, long second);

    default CharToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
