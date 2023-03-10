package it.unibo.tankBattle.GameObject.api;

import it.unibo.tankBattle.GameObject.common.Directions;
import it.unibo.tankBattle.GameObject.common.Point2D;

public interface GameObjectFactory {

    public GameObject createTank(Point2D pos, Directions dir);

    public GameObject createBullet(Point2D pos);

    public GameObject createWall(Point2D pos);
    
}
