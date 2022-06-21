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
    
    Boss1 boss1;
    Boss2 boss2;
    FinalBoss finalBoss;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(600, 400, 1, false); 
        prepare();
        
      
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
        addObject(wall2,70,220);
        Wall5 wall5 = new Wall5();
        addObject(wall5, 540, -288);
        Wall4 wall4 = new Wall4();
        addObject(wall4,530,470);
        Wall3 wall3 = new Wall3();
        addObject(wall3, 1037, 313);
        Wall6 wall6 = new Wall6();
        addObject(wall6, 1583, 25);
        Wall7 wall7 = new Wall7();
        addObject(wall7, 1076, -288);
        Wall8 wall8 = new Wall8();
        addObject(wall8, -107, -290);
        Wall9 wall9 = new Wall9();
        addObject(wall9, -107, -590);
        Wall10 wall10 = new Wall10();
        addObject(wall10,400,-790);       
        Wall11 wall11 = new Wall11();
        addObject(wall11,1583,-500);
        Wall12 wall12 = new Wall12();
        addObject(wall12, 1583, -630);   
        Wall13 wall13 = new Wall13();
        addObject(wall13, 1368, -787);
        Wall14 wall14 = new Wall14();
        addObject(wall14, 870, -610);
        Wall15 wall15 = new Wall15();
        addObject(wall15, 300, 380);
        
        boss1 = new Boss1();
        addObject(boss1, 625,-50);
        
        boss2 = new Boss2();
        addObject(boss2, 700,-500);
        
        finalBoss = new FinalBoss();
        addObject(finalBoss, 1025,-800);
        
        player = new Turtle();
        addObject(player,300, 200);

       //Object1 object1 = new Object1();
        //addObject(object1,125,300);
       // Object1 object12 = new Object1();
        //addObject(object12,476,300);
        //Object2 object2 = new Object2();
       // addObject(object2,300,21);

      

      
    }
    
    public void act()
    {
        int scrollX = player.getX() - getWidth() / 2;
        int scrollY = player.getY() - getHeight() / 2;
        scroll(scrollX, scrollY);
    }
    
    //lets player wonder around
    public void scroll(int x, int y)
    {
        for (Actor actor : getObjects(Actor.class))
        {
            actor.setLocation(actor.getX() - x,actor.getY() - y);
        }
    }
    


}



