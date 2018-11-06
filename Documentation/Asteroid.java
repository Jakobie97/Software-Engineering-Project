import greenfoot.*;

public class Asteroid {
   private int size;
   private int health;
   
   public Asteroid() {
      
   }
   public void act() {
   //Power Up stuff 
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
         setLocation(getX(), getY() + 1);
      }
   }
   public int life() {
   
     
      damage += damage + x;
      this.remove();
   }
}