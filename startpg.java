import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.WorldHandler;  
import javax.swing.*;  
import java.awt.Cursor;  
import java.awt.Point;  
import java.awt.Toolkit;  

/**
 * Write a description of class startpg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startpg extends World
{
public int killed;
    /**
     * Constructor for objects of class startpg.
     * 
     */
    public startpg()
    {    
       
        super(1200, 900, 1); 
        begin();
    }
    private void begin()
    {
        options play = new play();
        addObject(play,541,324);
        return;
    }
    public void ChangeMouseImage(GreenfootImage image, int XClick, int YClick)  
{  
    JPanel Panel = WorldHandler.getInstance().getWorldCanvas();  
    Cursor Cursor;  
    Toolkit Tk = Toolkit.getDefaultToolkit();  
    Point CursorPoint= new Point(XClick,YClick);  
    Cursor = Tk.createCustomCursor(image.getAwtImage(),CursorPoint,"cursor");  
    Panel.setCursor(Cursor);  
}  

  public void countkill()
   { killed++;}
  public int getkilled()
   { return killed;}

}
