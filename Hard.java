import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Actor
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Auswahl für den schweren Spielmodus
        if (Greenfoot.mouseClicked(this)) {
            /* Erstellt Spieler mit sehr wenig (3) Leben und 625ms Verzögerung
             * zwischen den Schüssen
            */
            Player player = new Player(3, 625);
            getWorld().addObject(player, 1000, 90);
            // Erstellt Gegner
            Enemy enemy = new Enemy();
            getWorld().addObject(enemy, 150, 500);
            // Entfernt alle Elemente des Startbildschirms
            getWorld().removeObjects(getWorld().getObjects(GameStart.class));
            getWorld().removeObjects(getWorld().getObjects(Easy.class));
            getWorld().removeObjects(getWorld().getObjects(Medium.class));
            getWorld().removeObjects(getWorld().getObjects(EasyText.class));
            getWorld().removeObjects(getWorld().getObjects(MediumText.class));
            getWorld().removeObjects(getWorld().getObjects(HardText.class));
            getWorld().removeObjects(getWorld().getObjects(SlctDifficulty.class));
            getWorld().removeObject(this);
        }
    }    
}
