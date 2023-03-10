package it.unibo.tankBattle.model.gameState.api;

import java.util.stream.Stream;
import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.model.gameObject.api.GameObject;

public interface Gamestate {

    public void createWorld();

    public void update(Double time);

    public void shot(int player);

    public void setDirection(Directions direction, int player);

    public Stream<GameObject> getTanks();

    public Stream<GameObject> getBullets();

    public Stream<GameObject> getWalls();

    public void addGameStateListener(/*toDo */);
}
