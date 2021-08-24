package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
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
