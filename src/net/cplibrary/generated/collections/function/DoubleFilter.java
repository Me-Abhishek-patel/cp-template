package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
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
