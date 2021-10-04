package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleDoublePredicate {
    boolean value(double first, double second);

    default DoubleFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
