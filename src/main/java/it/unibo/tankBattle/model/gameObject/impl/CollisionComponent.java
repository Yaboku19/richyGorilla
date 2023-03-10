package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.model.gameObject.api.GameObject;

public abstract class CollisionComponent extends AbstractComponent{

    public abstract void resolveCollision(GameObject obj);
}
