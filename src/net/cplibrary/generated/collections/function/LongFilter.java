package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongFilter {
    boolean accept(long value);

    default LongFilter or(LongFilter f) {
        return (val) -> LongFilter.this.accept(val) || f.accept(val);
    }

    default LongFilter and(LongFilter f) {
        return (val) -> LongFilter.this.accept(val) && f.accept(val);
    }

    default LongFilter xor(LongFilter f) {
        return (val) -> LongFilter.this.accept(val) ^ f.accept(val);
    }

    default LongFilter not() {
        return (val) -> !LongFilter.this.accept(val);
    }
}
