package it.unibo.tankBattle;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.CollisionComponent;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;
import it.unibo.tankBattle.model.gameObject.impl.LifepointsComponent;
import it.unibo.tankBattle.model.gameObject.impl.MovingComponent;

public class TankBattle {
    public static void main(String[] arg) {
        GameObjectFactory factory = new GameObjectFactoryImpl();
        var tank = factory.createTank(new Point2D(10, 10));
        tank.setDirection(Directions.DOWN);
        var bullet = factory.createBullet(tank);
        var wall = factory.createWall(new Point2D(20, 10));
        System.out.println(tank.getDirection());
        tank.getComponent(MovingComponent.class).ifPresent(c -> System.out.println(c.getSpeed()));

        bullet.getComponent(LifepointsComponent.class).ifPresent(c -> System.out.println(c.getLifePoints()));
        
        tank.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(bullet));

        System.out.println(tank.getComponent(LifepointsComponent.class).get().getLifePoints());
        System.out.println(tank.getPosition());
        tank.getComponent(LifepointsComponent.class).ifPresent(lp -> System.out.println( lp.isAlive()));

        tank.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(wall));
        System.out.println(tank.getComponent(LifepointsComponent.class).get().getLifePoints());
        System.out.println(tank.getPosition());

        wall.getComponent(CollisionComponent.class).ifPresent(coll -> coll.resolveCollision(tank));
        System.out.println(wall.getPosition());

    }
}
