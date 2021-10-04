package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
