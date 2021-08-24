package net.cplibrary.collections.filter;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface Filter<T> {
    boolean accept(T value);
}
