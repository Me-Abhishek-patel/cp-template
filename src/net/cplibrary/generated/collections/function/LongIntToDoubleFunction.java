package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface LongIntToDoubleFunction {
    double value(long first, int second);

    default LongToDoubleFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToDoubleFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
