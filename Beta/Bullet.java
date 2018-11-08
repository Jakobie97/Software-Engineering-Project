import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int damage = 12;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet() {
    
    }
    public void act() 
    {
        setLocation(getX(), getY() - 1);
        Asteroid ast = (Asteroid) getOneIntersectingObject(Asteroid.class);
        if (ast != null) {
             getWorld().removeObject(this);
             ast.setHealth(ast.getHealth() - damage);
        }
        
    }    
}
