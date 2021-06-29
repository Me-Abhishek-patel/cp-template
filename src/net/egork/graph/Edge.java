package net.egork.graph;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface Edge {
    int getSource();

    int getDestination();

    long getWeight();

    long getCapacity();

    long getFlow();

    void pushFlow(long flow);

    boolean getFlag(int bit);

    void setFlag(int bit);

    void removeFlag(int bit);

    int getTransposedID();

    Edge getTransposedEdge();

    int getReverseID();

    Edge getReverseEdge();

    int getID();

    void remove();

    void restore();
}
