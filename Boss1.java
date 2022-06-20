import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Actor
{
    public void askQuestion(){
        String answer = Greenfoot.ask("Hello, if you can answer my ridde I will let you pass. What can’t talk but will reply when spoken to?");
          if(answer.equalsIgnoreCase("echo")){
              getWorld().removeObject(this);
          }
          else{
              askQuestion();
          }
        
    }
    
    
    /**
     * Act - do whatever the Boss1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor Boss1 = getOneIntersectingObject(Turtle.class);
        if(Boss1 != null)  
        {  
          askQuestion();
        
        }  
        
    }    
}
