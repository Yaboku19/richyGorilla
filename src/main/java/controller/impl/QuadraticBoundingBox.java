package controller.impl;

import java.util.stream.Stream;

import controller.api.BoundingBox;
import it.unibo.tankBattle.common.Point2D;

public class QuadraticBoundingBox implements BoundingBox{
    
    private Point2D center;
    private int length;

    public QuadraticBoundingBox(Point2D center, int length) {
        this.center = center;
        this.length = length;
    }

    public Point2D getUpLeftCorner() {
        return new Point2D(this.center.getX() - (this.length / 2), this.center.getY() - (this.length / 2));
    }

    public Point2D getBottomRightCorner() {
        return new Point2D(this.center.getX() + (this.length / 2), this.center.getY() + (this.length / 2));
    }

    private Stream<Point2D> objectArea(Point2D center, int length) {
        return Stream.concat(
            Stream.concat(
                Stream
                    .iterate(getUpLeftCorner(), x -> new Point2D(getUpLeftCorner().getX() + 1, getUpLeftCorner().getY()))
                    .limit(this.length)
                ,
                Stream
                    .iterate(getBottomRightCorner(), x -> new Point2D(getBottomRightCorner().getX() - 1, getUpLeftCorner().getY()))
                    .limit(this.length)
                ),
            Stream.concat(
                Stream
                    .iterate(getUpLeftCorner(), x -> new Point2D(getUpLeftCorner().getX(), getUpLeftCorner().getY() + 1))
                    .limit(this.length)
                ,
                Stream
                    .iterate(getBottomRightCorner(), x -> new Point2D(getBottomRightCorner().getX(), getBottomRightCorner().getY() - 1))
                    .limit(this.length)
                )
        );
    }
    
    @Override
    public boolean isColliding(Point2D centerObject1, int lengthObject1, Point2D centerObject2, int lengthObject2) {
        for (Point2D x : this.objectArea(centerObject2, lengthObject2).toList()) {
            if (this.objectArea(centerObject1, lengthObject1).toList().contains(x)) {
                return true;
            }
        }
        return false;
    }
}
