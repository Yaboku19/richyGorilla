package it.unibo.tankBattle.model.gameObject.impl;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.GameObject;

public class TankCollisionComponent extends CollisionComponent {



    @Override
    public void update() {

    }

    @Override
    public void resolveCollision(GameObject obj) {
        if(this.getGameObject().getComponent(MovingComponent.class).isPresent()) {
            var speed = this.getGameObject().getComponent(MovingComponent.class).get().getSpeed();
            Directions dir = this.manageCollision(obj.getPosition());
            
            this.getGameObject().setPosition(new Point2D(this.getGameObject().getPosition().getX() + dir.getX()*speed,
                    this.getGameObject().getPosition().getY() + dir.getY()*speed));
        }
        if(obj.getComponent(DamageComponent.class).isPresent() && 
        this.getGameObject().getComponent(LifepointsComponent.class).isPresent()) {
            this.getGameObject().getComponent(LifepointsComponent.class).get()
                    .decreaseLifepoints(obj.getComponent(DamageComponent.class).get().getDamage());
        }
    }
    
    private Directions manageCollision(final Point2D collidingObjPos) {
        final Double differenceX = collidingObjPos.getX() - this.getGameObject().getPosition().getX();
        final Double differenceY = collidingObjPos.getY() - this.getGameObject().getPosition().getY();
        return Math.abs(differenceX) >= Math.abs(differenceY) 
            ? differenceX >= 0 
                ? Directions.LEFT
                : Directions.RIGHT
            : differenceY >=0
                ? Directions.UP
                : Directions.DOWN;
    }
}
