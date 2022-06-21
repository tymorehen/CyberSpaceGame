import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    //this is what the player shoots
    public void act()
    {
        move(5);
        if (isTouching(Obstacle.class))
        {
           getWorld().removeObject(this);
        }
    }
}
