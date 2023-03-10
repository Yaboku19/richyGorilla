package it.unibo.tankBattle.model.gameState.impl;

import java.util.stream.Stream;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.model.gameObject.api.GameObject;
import it.unibo.tankBattle.model.gameState.api.GameState;
import it.unibo.tankBattle.model.world.api.FactoryWorld;
import it.unibo.tankBattle.model.world.api.World;
import it.unibo.tankBattle.model.world.impl.FacotryWorldImpl;

public class GameStateImpl implements GameState {
    private final FactoryWorld factoryWorld;
    private World world = null;

    public GameStateImpl() {
        factoryWorld = new FacotryWorldImpl();
    }

    @Override
    public void createWorld() {
        world = factoryWorld.simpleWorld();
    }

    @Override
    public void update(Double time) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void shot(int player) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shot'");
    }

    @Override
    public void setDirection(Directions direction, int player) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDirection'");
    }

    @Override
    public Stream<GameObject> getTanks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTanks'");
    }

    @Override
    public Stream<GameObject> getBullets() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBullets'");
    }

    @Override
    public Stream<GameObject> getWalls() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWalls'");
    }

    @Override
    public void addGameStateListener() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addGameStateListener'");
    }    
}
