package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntIntToLongFunction {
    long value(int first, int second);

    default IntToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
