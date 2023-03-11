package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.model.gameObject.api.LifeComponent;

public class BulletLifeComponent extends LifeComponent{

    private boolean alive = true;

    @Override
    public void update() {
        //toDo 
    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

    protected void hasCollide() {
        this.alive = false;
    }
    
}
