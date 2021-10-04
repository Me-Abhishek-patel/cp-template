package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleIntToLongFunction {
    long value(double first, int second);

    default DoubleToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
