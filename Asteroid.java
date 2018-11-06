// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Asteroid extends Actor
{
   private int size;
   private int health;

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
        for (Asteroid a : asteroids) {
         if (health <= 0) {
            int pwrUp = Greenfoot.getRandomNumber(9);
            if (pwrUp < 2) {
               addObject(new Speed(), a.getX(), a.getY()); 
            }
            if (pwrUp > 8) {
               addObject(new Damage(), a.getX(), a.getY());
            }
            a.remove();
         }
        
    }
}
