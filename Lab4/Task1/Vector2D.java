package Lab4.Task1;

public class Vector2D {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Vector2D(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getDx() {
        return x2 - x1;
    }

    public double getDy() {
        return y2 - y1;
    }

    public Vector2D add(Vector2D other) {
        double sumDx = getDx() + other.getDx();
        double sumDy = getDy() + other.getDy();
        return new Vector2D(x1, y1, x1 + sumDx, y1 + sumDy);
    }

    public double dotProduct(Vector2D other) {
        return getDx() * other.getDx() + getDy() * other.getDy();
    }

    public Vector2D multiply(double number) {
        double newX2 = x1 + getDx() * number;
        double newY2 = y1 + getDy() * number;
        return new Vector2D(x1, y1, newX2, newY2);
    }

    public double getLength() {
        double dx = getDx();
        double dy = getDy();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x1 + ", " + y1 + ") -> (" + x2 + ", " + y2 + ")";
    }
}
