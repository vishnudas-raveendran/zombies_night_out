import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie_bg here.
 * 
 * @author (Vishnudas Raveendran) 
 * @version (Ver .1 date:4/8/13)
 */
public class zombie_bg extends World
{
   // Counter counter = new Counter("Score:");
    
    
    /**
     * Constructor for objects of class zombie_bg.
     * 
     */
    public zombie_bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1010,900, 1); 
        setPaintOrder(ScoreBoard.class, player.class, zomb_gen.class, options.class);
        populate();
        
    }
    
    private void populate()
     {
       addObject(new player(),577,524);
       addObject(new landmine(),766,482);
       /*addObject(new landmine(),766,482);
       addObject(new landmine(),766,482);*/
       //addObject(new Counter(),766,482);
     }
    
     public void act()
      {
          if(Greenfoot.getRandomNumber(100) < 2) {
            addObject(new zomb_gen(), Greenfoot.getRandomNumber(800),384);   
        }
        Greenfoot.playSound("background1.wav");
        //Greenfoot.playSound("background2.wav");
    }
    
    public void gameOver() 
    {
        //addObject(new ScoreBoard(counter.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
    
    
}
