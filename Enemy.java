import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class Enemy extends Actor{
    // Leben
    int hp = 3;
    // zur Berechnung des Cooldowns der Schüsse mit Echtzeit
    private int cooldownTime = 700;
    private long shootTime = 0;
    long curTime  = System.currentTimeMillis();
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        // Echtzeiterfassung
        long curTime  = System.currentTimeMillis();
        
        // Zufälliges Auswälen einer Aktion:
        int randomNumber = Greenfoot.getRandomNumber(4);
        if (randomNumber == 0) {
            // nichts tun
            move(1);
            move(-1);
        } else if (randomNumber == 1 ) {
           // nach vorne bewegen 
            move(5);
           /* wenn der Gegner sich auf eine Wand bewegt, geht er zur
            * Ausgangsposition vor der Wand zurück und kann somit nicht
            * durch die Wand gehen
           */
           if (getOneIntersectingObject(Wall.class) != null) {
               move(-5);
           }
        } else if (randomNumber == 2) {
            // dreht sich um einen zufälligen Winkel zwischen -45 und 45 Grad
            turn(Greenfoot.getRandomNumber(90)-45);
        } else if (randomNumber == 3) {
            // schießt, wenn seit dem letzten Schuss genug Zeit vergangen ist
            if (curTime - shootTime > cooldownTime) {
                shoot();
                shootTime = curTime;
            }
        }
        // überprüft, ob Objekt getroffen wurde
        getsHit();    
    }
    public void getsHit() {
        // wenn ein Bullet den Gegner berührt:
        if (getOneIntersectingObject(Bullets.class)!=null) {
            // Leben -1, Entfernen des Bullets
            hp --;
            removeTouching(Bullets.class);
            
            // Flacker-Animation
            int transparency = this.getImage().getTransparency();
            this.getImage().setTransparency(0);
            Greenfoot.delay(5);
            this.getImage().setTransparency(transparency);
            // Entfernung des Gegner-Objekts, wenn die Leben = 0 sind
            if (hp <= 0) {
                getWorld().removeObject(this);
            }
        }
    }
    public void shoot() {
        // aktuelle Ausrichtung des Objekts
        int currentRotation = this.getRotation();
        
        /* Berechnung der Richtung der 8 Bullets und Speicherung in einem
         * Array
         */
        int[] rotations = {currentRotation, currentRotation + 45, currentRotation + 90,  currentRotation + 135,  currentRotation + 180, currentRotation + 225, currentRotation + 270, currentRotation + 315};  
       
        /* Erstellung der Bullets mit den verschiedenen Richtungen aus dem 
         * Array
         */
        for (int i = 0; i < 8; i++) {
            Bullets_1 bullet1 = new Bullets_1(rotations[i]);
            getWorld().addObject(bullet1,getX(),getY());
            bullet1.setLocation(getX(),getY());
        }
    } 
}
