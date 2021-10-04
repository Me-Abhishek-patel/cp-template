package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
