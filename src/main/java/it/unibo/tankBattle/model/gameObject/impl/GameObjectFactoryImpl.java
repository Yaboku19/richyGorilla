package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObject;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;

public class GameObjectFactoryImpl implements GameObjectFactory {

    @Override
    public GameObject createTank(Point2D pos) {
        return new BasicGameObject(pos, 10, 10)
                .addComponent(new MovingComponent(10))
                .addComponent(new LifepointsComponent(100))
                .addComponent(new BoundingBoxComponent())
                .addComponent(new TankCollisionComponent());
    }

    @Override
    public GameObject createBullet(GameObject object) {
        return new BasicGameObject(new Point2D( object.getPosition().getX() + object.getDirection().getX()*object.getLength(), 
        object.getPosition().getY() + object.getDirection().getY()*object.getWidth()), 5, 5)
                .addComponent(new MovingComponent(10))
                .addComponent(new BoundingBoxComponent());
    }

    @Override
    public GameObject createWall(Point2D pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWall'");
    }
    
}
