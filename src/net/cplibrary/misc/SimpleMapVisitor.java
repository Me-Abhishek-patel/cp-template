package net.cplibrary.misc;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public abstract class SimpleMapVisitor extends MapVisitor {
    protected final boolean[][] processed;

    public SimpleMapVisitor(int rowCount, int columnCount) {
        this(rowCount, columnCount, MiscUtils.DX4, MiscUtils.DY4);
    }

    public SimpleMapVisitor(int rowCount, int columnCount, int[] dRow, int[] dColumn) {
        super(rowCount, columnCount, dRow, dColumn);
        processed = new boolean[rowCount][columnCount];
    }

    @Override
    protected void internalProcess(int row, int column, int fromRow, int fromColumn) {
        if (processed[row][column]) {
            return;
        }
        processed[row][column] = true;
        process(row, column, fromRow, fromColumn);
    }
}
