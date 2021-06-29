package net.egork.string;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface StringHash {
    long hash(int from, int to);

    long hash(int from);

    int length();
}
