import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor{
    // Array für die Anzeige der Leben des Spielers
    private Life[] lifes = new Life[this.hp];
    // Leben des Spielers
    public int hp;
    // zur Berechnung des Cooldowns der Schüsse mit Echtzeit
    private int cooldownTime = 625;
    private long shootTime = 0;
    long curTime  = System.currentTimeMillis();
    // Bewegungsgeschwindigkeit des Spielers
    private int speed = 4;
    //Boolean zur Festsellung des Spielbeginns (erster Aufruf von act()) 
    private boolean start = true;
    
    /* Constructor zur Übergabe einer bestimmten Lebensanzahl und Cooldown-Zeit
     * bei Erstellung des Spielers
    */
    public Player(int health, int cooldwn) {
        this.hp = health;
        this.cooldownTime = cooldwn;
    }
    public void act() 
    {   
        /* Erstellung der Lebens-Objekte in der oberen Bildschirmecke.
         * Die Anzahl basiert auf der hp-Variable, die durch den Constructor
         * bei Objekterstellung festgelegt wird
         */
        
        if (start) {
            // Erstellung und Hinzufügung der Leben zum Array zu Spielbeginn
            lifes = new Life[this.hp];
            for (int i = 0; i < this.hp; i++) {
                Life life = new Life();
                lifes[i] = life;
            }
            /* Platzierung der Leben in der Welt: y-Koordinate steht fest,
             * y-Koordinate wird mit von running berechnet
            */
            int running = 0;
            for (Life i : lifes) {
                getWorld().addObject(i, 30 + 60 * running,40);
                running ++;
            }
            /* Start wird false gesetzt, damit die Leben nicht die ganze Zeit
             * neu erstellt werden
            */
            start = false;
        }
        // Überprüfung der Tasteneingabe und ausführen der entsprechenden Aktion
        checkKeyPress();
        // überprüft, ob Spieler getroffen wurde
        getsHit();
    }
    
    public void checkKeyPress() {
        // Echtzeiterfassung
        long curTime  = System.currentTimeMillis();
        // Ausführen einer Aktion, je nachdem, welche Taste gedrückt wurde
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            // nach rechts drehen
            turn(4);
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            // nach links drehen
            turn(-4);
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) {
            // nach vorne bewegen 
            move(speed);
            /* wenn der Spieler sich auf eine Wand bewegt, geht er zur
            * Ausgangsposition vor der Wand zurück und kann somit nicht
            * durch die Wand gehen
           */
            if (getOneIntersectingObject(Wall.class) != null) {
                move(-speed);
            }    
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
              // nach hinten bewegen 
              move(-speed);
              /* siehe oben (nach vorne bewegen), hier nur in die andere 
               * Richtung
              */
           if (getOneIntersectingObject(Wall.class) != null) {
               move(speed);
           }
        }
        if (Greenfoot.isKeyDown("space")) {
            // schießt, wenn seit dem letzten Schuss genug Zeit vergangen ist
            if (curTime - shootTime > cooldownTime) {
                shoot();
                shootTime = curTime;
            }
        }
    }
    
    public void shoot() {
        // Erstellung eines Bullets mit der selben Ausrichtung/Bewegungsrichtung,
        // wie der Spieler
        Bullets bullet = new Bullets(this.getRotation());
        getWorld().addObject(bullet,getX(),getY());
        bullet.setLocation(getX(),getY());

    }
    
    public void getsHit() {
        // wenn ein Bullet(_1) den Spieler berührt:
        if (getOneIntersectingObject(Bullets_1.class)!=null) {
            // Leben -1
            hp --;
            
            // Setzt Transparenz des letzten sichtbaren Life-Objekts auf 0
            Life lost = lifes[hp];
            lost.getImage().setTransparency(0);
            
            // Entfernen des Bullets
            removeTouching(Bullets_1.class);
            
            // Flacker-Animation
            int transparency = this.getImage().getTransparency();
            this.getImage().setTransparency(0);
            Greenfoot.delay(5);
            this.getImage().setTransparency(transparency);
            
            
            
        }
        // wenn der Spieler den Gegner berührt:
        if (getOneIntersectingObject(Enemy.class)!= null) {
           // Leben -1
           hp --;
           
           // Setzt Transparenz des letzten sichtbaren Life-Objekts auf 0
           Life lost = lifes[hp];
           lost.getImage().setTransparency(0);
           
           // Flacker-Animation
           int transparency = this.getImage().getTransparency();
           this.getImage().setTransparency(0);
           Greenfoot.delay(5);
           this.getImage().setTransparency(transparency);
        }
        if (hp <= 0) {
                /* Entfernung des Gegner-Objekts, wenn die Leben = 0 sind
                 * und Aufruf der gameOver Methode zur Erstellung des
                 * Game-Over-Bildschirms
                 */
                gameOver();
                getWorld().removeObject(this);
                
        }
    }
     public void gameOver() {
         // Erstellung des Game-Over-Bildschirms
        getWorld().removeObjects(getWorld().getObjects(Enemy.class));
        GameOver gmOver = new GameOver();
        getWorld().addObject(gmOver,600, 400);
        ResetArrow arrow = new ResetArrow();
        getWorld().addObject(arrow,350, 750);
        GameOverText text = new GameOverText();
        getWorld().addObject(text,600, 400);
        
    }
}
