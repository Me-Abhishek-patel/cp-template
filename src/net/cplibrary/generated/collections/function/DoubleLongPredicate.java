package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleLongPredicate {
    boolean value(double first, long second);

    default DoubleFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
