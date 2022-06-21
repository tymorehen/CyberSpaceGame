import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends World
{

    /**
     * Constructor for objects of class YouWin.
     * 
     */
    public YouWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        showText ("press ENTER to restart", 300, 325);
        showText ("press ESCAPE to stop", 300, 100);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Turtle turtle = new Turtle();
        addObject(turtle,296,267);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            MyWorld myworld = new MyWorld();
            Greenfoot.setWorld(myworld);
        }       
        else if (Greenfoot.isKeyDown("escape"))
        {
           Greenfoot.stop();
        }       
    }
}
