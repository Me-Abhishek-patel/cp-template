package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongDoubleToDoubleFunction {
    double value(long first, double second);

    default LongToDoubleFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToDoubleFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
