import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        follow();
    }
    
    public void follow()
    {
        Actor turtle = (Actor)getWorld().getObjects(Turtle.class).get(0);
        turnTowards(turtle.getX(), turtle.getY());
        move(2);
        if (getWorld().getObjects(Turtle.class).isEmpty()) return;
        
    }
}
