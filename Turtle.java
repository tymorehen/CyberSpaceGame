import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    // frame counter
    int frameCounter = 0;
    
    // animation images
    
    GreenfootImage imageIdleRight0;
    
    
    
    public Turtle()
    {
        // load images
        imageIdleRight0 = new GreenfootImage("IdleRight0.png");
        
        imageIdleLeft0 = new GreenfootImage("IdleRight0.png");
        imageIdleRight0.mirrorHorizontally();
        
        
    }
    
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movementControls();
        animate();
        
    }
    
    public void movementControls()
    {
        // movement keys
        
        // left movement
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            setImage(imageIdleRight)
            move(4);
        }  
        // right movement
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(360);
            move(4);
        }
        // down movement
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(4);
        }
        // up movement
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
        }
        
    }
    
    public void animate()
    {
        
        
        
        // increment frame counter
        frameCounter++;
    }
}

