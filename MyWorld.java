import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Turtle player;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        Object1 object1 = new Object1();
        addObject(object1,125,300);
        Object1 object12 = new Object1();
        addObject(object12,476,300);
        Object2 object2 = new Object2();
        addObject(object2,300,21);

      
        Door1 door1 = new Door1();
        addObject(door1,615,123);


        Turtle Turtle = new Turtle();
        addObject(Turtle,299,350);
     

        player = new Turtle();
        addObject(player,299,350);
    }
    
    public void act()
    {
        int scrollX = player.getX() - getWidth() / 2;
        int scrollY = player.getY() - getHeight() / 2;
        scroll(scrollX, scrollY);
    }
    
    public void scroll(int x, int y)
    {
        for (Actor actor : getObjects(Actor.class))
        {
            actor.setLocation(actor.getX() - x,actor.getY() - y);
        }
    }
    
}
