package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface DoubleIntPredicate {
    boolean value(double first, int second);

    default DoubleFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
