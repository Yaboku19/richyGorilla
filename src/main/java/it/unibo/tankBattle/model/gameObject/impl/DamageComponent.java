package it.unibo.tankBattle.model.gameObject.impl;

public class DamageComponent extends AbstractComponent {

    private final int damage;
    
    public DamageComponent(int damage) {
        this.damage = damage;
    }

    @Override
    public void update() {
    
    }

    public int getDamage() {
        return damage;
    }
    
}
