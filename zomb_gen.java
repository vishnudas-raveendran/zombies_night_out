import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zomb_gen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zomb_gen extends Actor
{
    /**
     * Act - do whatever the zomb_gen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(),getY()+1);
       if (getY() == 600) {
            ((zombie_bg) getWorld()).gameOver();
        }
    }    
    
    public void kill() 
    {
        
        //((zombie_bg) getWorld()).countkill();
        getWorld().removeObject(this);
    }
    
}
