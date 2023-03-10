package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObject;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;

public class GameObjectFactoryImpl implements GameObjectFactory{

    @Override
    public GameObject createTank(Point2D pos, Directions dir) {
        return new BasicGameObject(pos, dir)
                .addComponent(new MovingComponent(10))
                .addComponent(new LifepointsComponent(100))
                .addComponent(new CollisionComponent());
    }

    @Override
    public GameObject createBullet(Point2D pos) {
        return new BasicGameObject(pos, null)
                .addComponent(new MovingComponent(10))
                .addComponent(new CollisionComponent());
    }

    @Override
    public GameObject createWall(Point2D pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWall'");
    }
    
    public void ctry() {
        var tank = this.createTank(null, null);
        tank.getComponent(MovingComponent.class).ifPresent(c -> c.getSpeed());
    }
}
