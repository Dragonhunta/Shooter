import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor {
    // Bewegungsrichtung des Geschosses
    int dir;
    /* Constructor zur Übergabe einer bestimmten Richtung bei Erstellung des
     * Objekts
    */
    public Bullets(int direction) {
        dir = direction;
    }
    
    
    public void act() 
    {
        // Festlegung der Bewegungsrichtung und Bewegung in diese
        this.setRotation(this.dir);
        move(10);
        // Entfernung des Objekts bei Zusammenstoß mit einer Wand
        if (isTouching(Wall.class)){
            getWorld().removeObject(this);
            
        }
    }    
}
