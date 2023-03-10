package it.unibo.tankBattle.model.world.api;

import java.util.stream.Stream;
import it.unibo.tankBattle.model.gameObject.api.GameObject;

public interface World {
    public Stream<GameObject> getEntities();

    public void removeGameObject(GameObject gameObject);

    public void addGameObject(GameObject addGameObject);
}
