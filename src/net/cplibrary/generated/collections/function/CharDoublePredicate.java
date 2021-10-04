package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharDoublePredicate {
    boolean value(char first, double second);

    default CharFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
