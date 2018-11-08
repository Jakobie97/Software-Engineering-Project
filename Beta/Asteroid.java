import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Asteroid extends Actor
{
    private int health = 50;
    protected int score = 0;
    

    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 1);
        if (isTouching(Rocket.class)) {
            removeTouching(Rocket.class);
            Greenfoot.stop();
            
        }
        if (getY() > getWorld().getHeight() - getImage().getHeight() / 2) {
            getWorld().removeObject(this);
            score++;
        }
        if (health <= 0) {
            getWorld().removeObject(this);
            score++;
        }
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int healthIn) {
        health = healthIn;
    }
    public int getScore() {
        return score;
    }
}

