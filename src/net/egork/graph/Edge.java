package net.egork.graph;

/**
 * @author Egor Kulikov (kulikov@devexperts.com)
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
