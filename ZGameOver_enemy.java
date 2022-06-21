import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZGameOver_enemy extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public ZGameOver_enemy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        showText ("press ENTER to try again", 300, 325);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            MyWorld myworld = new MyWorld();
            Greenfoot.setWorld(myworld);
        }       
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        EnemyImage enemy = new EnemyImage();
        addObject(enemy,297,250);
    }
}
