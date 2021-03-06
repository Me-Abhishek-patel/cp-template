package net.cplibrary.geometry;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class Ray {
    public final Point base;
    public final Line line;
    private final Line perpendicular;

    public Ray(Point base, double direction) {
        this.base = base;
        line = new Line(base, direction);
        this.perpendicular = line.perpendicular(base);
    }

    public Ray(Point base, Point other) {
        this.base = base;
        line = base.line(other);
        this.perpendicular = line.perpendicular(base);
    }

    public boolean contains(Point point) {
        return line.contains(point) && perpendicular.value(point) > -GeometryUtils.epsilon;
    }

    public double distance(Point point) {
        if (perpendicular.value(point) > -GeometryUtils.epsilon) {
            return line.distance(point);
        }
        return base.distance(point);
    }
}
