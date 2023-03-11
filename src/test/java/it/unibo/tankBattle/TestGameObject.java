package it.unibo.tankBattle;

import static org.junit.jupiter.api.Assertions.*;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.api.LifeComponent;
import it.unibo.tankBattle.model.gameObject.api.CollisionComponent;
import it.unibo.tankBattle.model.gameObject.api.GameObject;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;
import it.unibo.tankBattle.model.gameObject.impl.LifepointsComponent;

public class TestGameObject {
    
    private GameObjectFactory factory;
    private GameObject tank1;
    private GameObject bullet1;
    private GameObject tank2;
    private GameObject bullet2;

    @org.junit.jupiter.api.BeforeEach
    public void initFactory() {
        factory = new GameObjectFactoryImpl();
        tank1 = this.factory.createTank(new Point2D(10, 10));
        bullet1 = this.factory.createBullet(tank1);
        tank2 = this.factory.createTank(new Point2D(20, 10));
        bullet2 = this.factory.createBullet(tank2);
        tank1.setDirection(Directions.RIGHT);
        tank2.setDirection(Directions.LEFT);
    }

    @org.junit.jupiter.api.Test
    public void testCollision() {
        tank1.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(bullet2));
        assertEquals(50,tank1.getComponent(LifepointsComponent.class).get().getLifePoints());
        assertEquals(new Point2D(9,10), tank1.getPosition());
        tank1.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(tank2));
        assertEquals(50,tank1.getComponent(LifepointsComponent.class).get().getLifePoints());
        assertEquals(new Point2D(8,10), tank1.getPosition());
    }

    @org.junit.jupiter.api.Test
    public void testisAlive() {
        tank1.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(bullet2));
        bullet2.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(tank1));
        assertTrue(tank1.getComponent(LifeComponent.class).get().isAlive());
        assertFalse(bullet2.getComponent(LifeComponent.class).get().isAlive());
    }
}
