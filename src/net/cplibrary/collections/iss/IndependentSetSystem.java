package net.cplibrary.collections.iss;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface IndependentSetSystem {
    boolean join(int first, int second);

    int get(int index);

    int getSetCount();

    void setListener(Listener listener);

    interface Listener {
        void joined(int joinedRoot, int root);
    }
}
