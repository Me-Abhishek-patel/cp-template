package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongDoublePredicate {
    boolean value(long first, double second);

    default LongFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
