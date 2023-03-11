package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObject;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;

public class GameObjectFactoryImpl implements GameObjectFactory {

    @Override
    public GameObject createTank(Point2D pos) {
        return new BasicGameObject(pos, 10, 10)
                .addComponent(new MovingComponent(1))
                .addComponent(new LifepointsComponent(100))
                .addComponent(new TankCollisionComponent());
    }

    @Override
    public GameObject createBullet(GameObject object) {
        return new BasicGameObject(new Point2D( object.getPosition().getX() + object.getDirection().getX()*object.getLength(), 
        object.getPosition().getY() + object.getDirection().getY()*object.getWidth()), 5, 5)
                .addComponent(new MovingComponent(10))
                .addComponent(new DamageComponent(50))
                .addComponent(new BulletLifeComponent())
                .addComponent(new BulletCollisionComponent());
    }

    @Override
    public GameObject createWall(Point2D pos) {
       return new BasicGameObject(pos, 10, 10)
            .addComponent(new BoundingBoxComponent());
    }
    
}
