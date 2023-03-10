package it.unibo.tankBattle.model.gameObject.api;

import java.util.Optional;
import java.util.Set;

import it.unibo.tankBattle.common.Directions;
import it.unibo.tankBattle.common.Point2D;

/**
 * 
 * 
 * 
 */
public interface GameObject {
    
    public void update(double time);

    public Set<Component> getComponents();

    public <T extends Component> Optional<T> getComponent(Class<T> component);

    public GameObject addComponent(final Component component);

    public Point2D getPosition();

    public Directions getDirection();

    public void setDirection(Directions dir);

    public double getWidth();

    public double getLength();

    public void setPosition(Point2D position);

}
