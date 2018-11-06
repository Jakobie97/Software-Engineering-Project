import greenfoot.*;

public class Bullet {
   private int damage = 12;
   
   public Bullet() {
   
   }
   public void act() {
      move();
      Asteriod ast = (Asteroid) getOneIntersectingObject(Asteroid.class);
      if (ast != null) {
         getWorld.removeObject(this);
         Asteroid.hit(damage);
      }
   }
}
