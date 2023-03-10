package it.unibo.tankBattle.model.gameObject.api;

import it.unibo.tankBattle.common.Point2D;

public interface GameObjectFactory {

    public GameObject createTank(Point2D pos);

    public GameObject createBullet(GameObject object);

    public GameObject createWall(Point2D pos);
    
}
