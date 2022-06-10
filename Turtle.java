import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        //movement keys



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


        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(4);
        }  
        
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(360);
            move(4);
            
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(4);
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
        }
        
        // if turtle touches door1, transport to world2.
        if (isTouching(Door1.class))
        {
            Worldright WorldRight = new Worldright();
            Greenfoot.setWorld(WorldRight);
        }
        
        if (isTouching(Door2.class))
        {
            MyWorld myworld = new MyWorld();
            Greenfoot.setWorld(myworld);
        }
    }
}
