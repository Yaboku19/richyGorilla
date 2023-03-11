package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.model.gameObject.api.CollisionComponent;
import it.unibo.tankBattle.model.gameObject.api.GameObject;

public class BulletCollisionComponent extends CollisionComponent{

    @Override
    public void update() {
        //todo
    }

    @Override
    public void resolveCollision(GameObject obj) {
        if(this.getGameObject().getComponent(BulletLifeComponent.class).isPresent()) {
            this.getGameObject().getComponent(BulletLifeComponent.class).get().hasCollide();
        }
    }
    
}
