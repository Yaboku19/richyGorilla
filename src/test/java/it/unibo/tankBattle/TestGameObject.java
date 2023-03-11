package it.unibo.tankBattle;

import static org.junit.jupiter.api.Assertions.*;

import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.impl.CollisionComponent;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;

public class TestGameObject {
    
    private GameObjectFactory factory;

    @org.junit.jupiter.api.BeforeEach
    public void initFactory() {
        factory = new GameObjectFactoryImpl();
    }

    @org.junit.jupiter.api.Test
    public void testCollision() {
        var tank = this.factory.createTank(new Point2D(10, 10));
        var bullet = this.factory.createBullet(new Point2D(20, 10));
        tank.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(bullet));
    }
}
