package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharDoubleToLongFunction {
    long value(char first, double second);

    default CharToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
