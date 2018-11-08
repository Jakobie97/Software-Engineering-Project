import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Rocket extends Actor
{
    private int count = 0;
    private int speedRight = 2;
    private int speedLeft = -2;
    private int gunReloadTime;
    private int reloadDelay;

    /**
     * 
     */
    public Rocket()
    {
        gunReloadTime = 20;
    }

    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right")) {
            move(speedRight);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(speedLeft);
        }
        EatSpeed();
        fire();
        reloadDelay++;
    }

    /**
     * 
     */
    public void EatSpeed()
    {
        if (isTouching(SpeedBoost.class)) {
            removeTouching(SpeedBoost.class);
            speedRight = speedRight + 2;
            speedLeft = speedLeft - 2;
        }
    }

    /**
     * 
     */
    public void fire()
    {
        if (reloadDelay >= gunReloadTime) {
            if (Greenfoot.isKeyDown("space")) {
                Bullet b = new Bullet();
                getWorld().addObject(b, this.getX(), this.getY());
                reloadDelay = 0;
            }
    }
    }
}
