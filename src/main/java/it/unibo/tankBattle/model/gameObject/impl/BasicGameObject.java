package it.unibo.tankBattle.model.gameObject.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;
import it.unibo.tankBattle.model.gameObject.api.Component;
import it.unibo.tankBattle.model.gameObject.api.GameObject;

public class BasicGameObject implements GameObject{

    private Point2D position;
    private Directions direction;
    private final Set<Component> components = new HashSet<>();

    public BasicGameObject(Point2D position, Directions direction) {
        this.position = position;
        this.direction = direction;
    }

    @Override
    public void update(double time) {
        //todo
    }

    @Override
    public Set<Component> getComponents() {
        return components;
    }

    @Override
    public <T extends Component> Optional<T> getComponent(Class<T> component) {
        return this.components.stream()
                .filter(comp -> component.isInstance(comp))
                .map(comp -> component.cast(comp))
                .findFirst();
    }

    @Override
    public GameObject addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    @Override
    public Point2D getPosition() {
        return position;
    }

    @Override
    public Directions getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Directions dir) {
        this.direction = dir;
    }

   
    
}
