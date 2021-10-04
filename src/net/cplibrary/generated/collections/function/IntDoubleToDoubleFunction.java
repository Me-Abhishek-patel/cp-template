package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntDoubleToDoubleFunction {
    double value(int first, double second);

    default IntToDoubleFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
