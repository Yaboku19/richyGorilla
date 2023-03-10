package it.unibo.tankBattle.model.world.impl;

import java.util.HashSet;
import java.util.Set;

import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObject;
import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;
import it.unibo.tankBattle.model.world.api.FactoryWorld;
import it.unibo.tankBattle.model.world.api.World;

public class FactoryWorldImpl implements FactoryWorld{
    private final GameObjectFactory factoryGO;
    private static final int ROW = 9;
    private static final int COLUMN = 14;
    private static final int size = 10;

    public FactoryWorldImpl() {
        factoryGO = new GameObjectFactoryImpl();
    }

    @Override
    public World simpleWorld() {
        Set<GameObject> entities = getBorder();
        entities.add(factoryGO.createTank(position(1, 1)));
        entities.add(factoryGO.createTank(position(COLUMN - 1, ROW - 1)));
        return new WorldImpl(entities.stream());
    }

    private Set<GameObject> getBorder() {
        Set<GameObject> border = new HashSet<>();
        for(int i = 0; i < ROW; i++) {
            border.add(factoryGO.createWall(position(0, i)));
            border.add(factoryGO.createWall(position(COLUMN, i)));
        }

        for(int i = 0; i < ROW; i++) {
            border.add(factoryGO.createWall(position(i, 0)));
            border.add(factoryGO.createWall(position(i, ROW)));
        }
        return border;
    }
    
    private Point2D position(int multiplier1, int multiplier2) {
        return new Point2D(multiplier1 * size + size / 2, multiplier2 * size + size / 2);
    }
}
