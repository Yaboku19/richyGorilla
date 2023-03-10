package it.unibo.tankBattle.model.world.impl;

import it.unibo.tankBattle.model.gameObject.api.GameObjectFactory;
import it.unibo.tankBattle.model.gameObject.impl.GameObjectFactoryImpl;
import it.unibo.tankBattle.model.world.api.FactoryWorld;
import it.unibo.tankBattle.model.world.api.World;

public class FactoryWorldImpl implements FactoryWorld{
    private final GameObjectFactory factoryGameObject;

    public FactoryWorldImpl() {
        factoryGameObject = new GameObjectFactoryImpl();
    }

    @Override
    public World simpleWorld() {
        // toDo
        return null;
    }
    
}
