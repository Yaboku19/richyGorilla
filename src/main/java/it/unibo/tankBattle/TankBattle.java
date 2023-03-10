package it.unibo.tankBattle;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;
import it.unibo.tankBattle.model.gameObject.impl.LifepointsComponent;
import it.unibo.tankBattle.model.gameObject.impl.MovingComponent;
import it.unibo.tankBattle.model.gameObject.impl.TankCollisionComponent;

public class TankBattle {
    public static void main(String[] arg) {
        GameObjectFactory factory = new GameObjectFactoryImpl();
        var tank = factory.createTank(new Point2D(10, 10));
        var bullet = factory.createBullet(tank);
        tank.setDirection(Directions.DOWN);
        System.out.println(tank.getDirection());
        tank.getComponent(MovingComponent.class).ifPresent(c -> System.out.println(c.getSpeed()));
        bullet.getComponent(LifepointsComponent.class).ifPresent(c -> System.out.println(c.getLifePoints()));
        tank.getComponent(TankCollisionComponent.class).ifPresent(coll -> coll.resolveCollision(bullet));

    }
}
