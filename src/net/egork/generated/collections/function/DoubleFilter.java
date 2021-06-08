package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleFilter {
    boolean accept(double value);

    default DoubleFilter or(DoubleFilter f) {
        return (val) -> DoubleFilter.this.accept(val) || f.accept(val);
    }

    default DoubleFilter and(DoubleFilter f) {
        return (val) -> DoubleFilter.this.accept(val) && f.accept(val);
    }

    default DoubleFilter xor(DoubleFilter f) {
        return (val) -> DoubleFilter.this.accept(val) ^ f.accept(val);
    }

    default DoubleFilter not() {
        return (val) -> !DoubleFilter.this.accept(val);
    }
}
