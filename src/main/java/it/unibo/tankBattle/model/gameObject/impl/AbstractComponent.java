package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.model.gameObject.api.Component;
import it.unibo.tankBattle.model.gameObject.api.GameObject;

public abstract class AbstractComponent implements Component{
    
    private GameObject object;

    protected GameObject getGameObject() {
        return object;
    }

    protected void setGameObject(final GameObject obj) {
        this.object = obj;
    }
}
