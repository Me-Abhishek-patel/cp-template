package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongDoubleToLongFunction {
    long value(long first, double second);

    default LongToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
