package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntDoubleToLongFunction {
    long value(int first, double second);

    default IntToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
