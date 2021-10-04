package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntLongToLongFunction {
    long value(int first, long second);

    default IntToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
