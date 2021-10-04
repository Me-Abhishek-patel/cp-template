package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharIntPredicate {
    boolean value(char first, int second);

    default CharFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
