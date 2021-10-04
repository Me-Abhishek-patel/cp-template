package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IntIntPredicate {
    boolean value(int first, int second);

    default IntFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
