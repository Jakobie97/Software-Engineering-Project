import java.util.*;
import greenfoot.*;

/**
 * @Authors: Jacob 
 * @version: 11/04/18
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(700, 700, 1);
        addObject( new Rocket(), 350, 550);
    }

    /**
     * Spawns Asteroids at top of world
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject( new Asteroid(), Greenfoot.getRandomNumber(700), 0);
        }
        if (Greenfoot.getRandomNumber(10000) < 6) {
            addObject( new SpeedBoost(), Greenfoot.getRandomNumber(700), 0);
        }
    }
}
