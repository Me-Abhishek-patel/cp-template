package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleDoubleToIntFunction {
    int value(double first, double second);

    default DoubleToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
