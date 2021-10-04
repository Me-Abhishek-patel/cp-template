package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntDoubleToIntFunction {
    int value(int first, double second);

    default IntToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
