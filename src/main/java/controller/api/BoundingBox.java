package controller.api;

import it.unibo.tankBattle.common.Point2D;

public interface BoundingBox {

    boolean isColliding(Point2D centerObject1, int lengthObject1, Point2D centerObject2, int lengthObject2);

}
