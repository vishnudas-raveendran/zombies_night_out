import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Follow the mouse
        if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        // kill
        if(Greenfoot.mouseClicked(null)) {
            Greenfoot.playSound("gunsnd.wav");
            int x = -getImage().getWidth()/2;
            int y = getImage().getHeight()/2;
            zomb_gen zombie = (zomb_gen) getOneObjectAtOffset(x , y, zomb_gen.class);
            if(zombie!= null) {
                zombie.kill();
                // ((startpg) getWorld()).countkill();
            }
            
           
        }
        
        
    }    
    
}
