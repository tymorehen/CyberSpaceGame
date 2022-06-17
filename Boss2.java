import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2 extends Actor
{
    public void askQuestion(){
        String answer = Greenfoot.ask("A giraffe has two eyes, a monkey has two eyes, and an elephant has two eyes, how many eyes do we have?");
          if(answer.equalsIgnoreCase("4")){
              getWorld().removeObject(this);
          }
          else{
              askQuestion();
          }
        
    }
    
    
    /**
     * Act - do whatever the Boss2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor Boss2 = getOneIntersectingObject(Turtle.class);
        if(Boss2 != null)  
        {  
          askQuestion();
        
        }  
        
    }    
}
