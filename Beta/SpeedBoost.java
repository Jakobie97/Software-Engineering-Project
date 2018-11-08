import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SpeedBoost extends Actor
{

    /**
     * Act - do whatever the SpeedBoost wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 1);
        if (getY() > getWorld().getHeight() - getImage().getHeight() / 2) {
            getWorld().removeObject(this);
            
        }
    }
}

