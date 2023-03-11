package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.model.gameObject.api.LifeComponent;

public class LifepointsComponent extends LifeComponent{

    private int lifePoints;

    public LifepointsComponent(final int lifePoints) {
        this.lifePoints = lifePoints;
    }

    @Override
    public void update() {
        
    }

    @Override
    public boolean isAlive() {
        return this.lifePoints>0;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    protected void decreaseLifepoints(final int damage) {
        this.lifePoints = lifePoints - damage;
    }

    
    
}
