import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worldright here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldright extends World
{

    /**
     * Constructor for objects of class Worldright.
     * 
     */
    public Worldright()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Object2 object2 = new Object2();
        addObject(object2,85,325);
        Object1 object1 = new Object1();
        addObject(object1,124,73);
        Turtle turtle = new Turtle();
        addObject(turtle,33,226);
        Door2 door2 = new Door2();
        addObject(door2,-15,223);
    }
}
