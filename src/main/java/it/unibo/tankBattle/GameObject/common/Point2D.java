package it.unibo.tankBattle.GameObject.common;

public class Point2D {
    
 
    private double x;
    private double y;

    public Point2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D sum(final Point2D v) {
        return new Point2D(x + v.getX(), y + v.getY());
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return "P2d("+x+","+y+")";
    }

    @Override
    public int hashCode() {
        final double prime = 31;
        double result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return (int)result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
            Point2D other = (Point2D) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }


}
