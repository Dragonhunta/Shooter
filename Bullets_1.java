import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * Diese Klasse gibt es, weil die Geschosse vom Spieler bzw. Gegner anders behandelt
 * werden sollen. Wenn der Spieler die selben Bullets wie der Gegner schießen 
 * würde, wäre es nicht so einfach möglich festzustellen, von wem das Geschoss 
 * jetzt eigentlich kommt und wie die anderen Objekte damit interagieren müssen.
 * (Z. B. damit der Spieler nicht direkt von seinen eigenen Bullets getroffen
 * wird, wenn sie gespawnt weden.)
 */
public class Bullets_1 extends Actor {
    // Bewegungsrichtung des Geschosses
    int dir;
    /* Constructor zur Übergabe einer bestimmten Richtung bei Erstellung des
     * Objekts
    */
    public Bullets_1(int direction) {
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
