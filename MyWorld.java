import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int[] scores = {0,0,0,0};
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(600, 400, 1, false); 
        prepare();
        
        Label label = new Label("Score:0000",25);
        addObject(label, 100, 50);
    }
    public int getScore(int player)
    {
        return scores[player];
    }
     
    public void addScore(int player, int amount)
    {
        scores[player] += amount;
    }
     
    public int[] getScores()
    {
        return scores;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall1 wall1 = new Wall1();
        addObject(wall1,300,30);
        Wall2 wall2 = new Wall2();
        addObject(wall2,150,120);
        Wall4 wall4 = new Wall4();
        addObject(wall4,690,210);
        Turtle turtle = new Turtle();
        addObject(turtle,299,350);
        
    }
   
}
