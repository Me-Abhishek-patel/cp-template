package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleLongToIntFunction {
    int value(double first, long second);

    default DoubleToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
