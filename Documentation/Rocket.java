import greenfoot.*;

public class Rocket {
   private int gunReloadTime;
   private int reloadDelay;
   //private int speed = 5;
   
   public Rocket() {
      gunReloadTime = 20;
   }
   
   public void act() {
      //leftRightCheck();
      powerUpCheck();
      gameEndCheck();
      fireCheck();
      reloadDelay++;
   }
   
  // private void leftRightCheck() {
     // if(Greenfoot.isKeyDown("left")) {
     //    move();
     // }
     // if(Greenfoot.isKeyDown("right")) {
     //    move();
    //  }
  // }
   
   private void fire() {
      
         if (reloadDelay <= gunReloadTime) {
            Bullet b = new Bullet();
            getWorld().addObject(b, getX(), getY());
            b.move();
            reloadDelay = 0;         
         }
      
   }
   private void fireCheck() {
      if (Greenfoot.isKeyDown("space")) {
         fire();
      }
   }
   
   private void powerUpCheck() {
      Damage d = (Damage) getOneIntersectingObject(Damage.class);
      if (d != null) {
         // power-up method
      }
      Speed s = (Speed) getOneIntersectingObject(Speed.class);
      if (s != null) {
         // Power-up method
      }
      
   }
   
   private void gameEndCheck() {
      Asteroid a = (Asteroid) getOneIntersectingObject(Asteroid.class);
      if (a != null) {
         getWorld().addObject(new Explosion(), getX(), getY());
         getWorld().removeObject(this);
      }
   }
}
