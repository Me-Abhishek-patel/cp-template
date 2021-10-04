package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntDoublePredicate {
    boolean value(int first, double second);

    default IntFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
