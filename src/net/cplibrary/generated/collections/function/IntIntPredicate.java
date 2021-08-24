package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
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
