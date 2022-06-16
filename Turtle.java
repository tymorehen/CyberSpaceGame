import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveplayer();
        
    }    //movement keys
    
    public void moveplayer()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed,getY());
            setRotation (180);
        }  
        
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed,getY());
            setRotation(0);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + speed);
            setRotation(90);
        }
        
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - speed);
            setRotation(270);
        }
        if(Greenfoot.mouseClicked(null))
        {
            Arrow arrow = new Arrow();
            getWorld().addObject(arrow, getX(), getY());
            arrow.rotate();
        }
    }
    
}
