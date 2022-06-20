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
        Actor obstacleRight = getOneObjectAtOffset(getImage().getWidth()/2, 0, Obstacle.class);
          
        Actor obstacleLeft = getOneObjectAtOffset(-getImage().getWidth()/2, 0, Obstacle.class);
        
        Actor obstacleUp = getOneObjectAtOffset(0, getImage().getHeight()/2, Obstacle.class);
        
        Actor obstacleDown = getOneObjectAtOffset(0, -getImage().getHeight()/2, Obstacle.class);
        
        if (obstacleRight != null) {
            setLocation(obstacleRight.getX() - obstacleRight.getImage().getWidth()/2 - getImage().getWidth()/2, getY());
        }
        if (obstacleLeft != null) {
            setLocation(obstacleLeft.getX() + obstacleLeft.getImage().getWidth()/2 + getImage().getWidth()/2, getY());
        }
        if (obstacleUp != null) {
            setLocation( getX() ,obstacleUp.getY() - obstacleUp.getImage().getHeight()/2 - getImage().getHeight()/2);
        }
        if (obstacleDown != null) {
            setLocation( getX() ,obstacleDown.getY() + obstacleDown.getImage().getHeight()/2 + getImage().getHeight()/2);
        }
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
