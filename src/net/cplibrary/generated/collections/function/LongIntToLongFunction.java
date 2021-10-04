package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongIntToLongFunction {
    long value(long first, int second);

    default LongToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
