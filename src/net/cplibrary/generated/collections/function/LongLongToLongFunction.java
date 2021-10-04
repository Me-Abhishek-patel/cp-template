package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongLongToLongFunction {
    long value(long first, long second);

    default LongToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
