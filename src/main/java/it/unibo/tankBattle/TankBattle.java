package it.unibo.tankBattle;

import it.unibo.tankBattle.GameObject.common.Directions;
import it.unibo.tankBattle.GameObject.common.Point2D;
import it.unibo.tankBattle.GameObject.impl.GameObjectFactoryImpl;
import it.unibo.tankBattle.GameObject.impl.LifepointsComponent;
import it.unibo.tankBattle.GameObject.impl.MovingComponent;
import it.unibo.tankBattle.GameObject.api.GameObjectFactory;

public class TankBattle {
    public static void main(String[] arg) {
        GameObjectFactory factory = new GameObjectFactoryImpl();
        var tank = factory.createTank(new Point2D(10, 10), Directions.UP);
        var bullet = factory.createBullet(new Point2D(0, 0));
        tank.setDirection(Directions.DOWN);
        System.out.println(tank.getDirection());
        tank.getComponent(MovingComponent.class).ifPresent(c -> System.out.println(c.getSpeed()));
        bullet.getComponent(LifepointsComponent.class).ifPresent(c -> System.out.println(c.getLifePoints()));

    }
}
