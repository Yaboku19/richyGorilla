package it.unibo.tankBattle;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;

public class TankBattle {
    public static void main(String[] arg) {
        GameObjectFactory factory = new GameObjectFactoryImpl();
        var tank = factory.createTank(new Point2D(10, 10));
        tank.setDirection(Directions.DOWN);
        //var bullet = factory.createBullet(tank);
        //var wall = factory.createWall(new Point2D(20, 10));

    }
}
