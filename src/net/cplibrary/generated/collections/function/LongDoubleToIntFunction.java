package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongDoubleToIntFunction {
    int value(long first, double second);

    default LongToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
