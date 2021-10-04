package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongLongToIntFunction {
    int value(long first, long second);

    default LongToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
