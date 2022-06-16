 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Arrow extends Actor
{
    public static int FULL_LIFE = 50;
    public int life = FULL_LIFE;
    public void act()
    {
        move(9);
        life--;
    }    
    public void rotate()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        turnTowards(mouse.getX(), mouse.getY());
    }    
}
