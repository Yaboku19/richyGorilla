package it.unibo.tankBattle.GameObject.impl;


public class MovingComponent extends AbstractComponent{

    private final int speed;

    public MovingComponent(int speed) {
        this.speed = speed;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public int getSpeed() {
        return this.speed;
    }
    
}
