// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
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

    /**
     * 
     */
    public Rocket()
    {
    }

    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
            
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(speedRight);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(speedLeft);
        }
        EatSpeed();
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
}
