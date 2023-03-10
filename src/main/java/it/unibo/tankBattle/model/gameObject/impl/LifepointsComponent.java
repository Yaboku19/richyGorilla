package it.unibo.tankBattle.model.gameObject.impl;

public class LifepointsComponent extends AbstractComponent{

    private int lifePoints;

    public LifepointsComponent(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    @Override
    public void update() {
        
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public void decreaseLifepoints(int damage) {
        this.lifePoints = lifePoints - damage;
    }

    public boolean isAlive() {
        return this.lifePoints>0;
    }
    
}
