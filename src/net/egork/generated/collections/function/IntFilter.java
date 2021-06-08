package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntFilter {
    boolean accept(int value);

    default IntFilter or(IntFilter f) {
        return (val) -> IntFilter.this.accept(val) || f.accept(val);
    }

    default IntFilter and(IntFilter f) {
        return (val) -> IntFilter.this.accept(val) && f.accept(val);
    }

    default IntFilter xor(IntFilter f) {
        return (val) -> IntFilter.this.accept(val) ^ f.accept(val);
    }

    default IntFilter not() {
        return (val) -> !IntFilter.this.accept(val);
    }
}
