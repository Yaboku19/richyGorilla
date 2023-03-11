package it.unibo.tankBattle.model.gameObject.api;

import it.unibo.tankBattle.model.gameObject.impl.AbstractComponent;

public abstract class CollisionComponent extends AbstractComponent{

    public abstract void resolveCollision(GameObject obj);
}
