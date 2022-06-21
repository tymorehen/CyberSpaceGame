import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBoss extends Actor
{
    public void askQuestion(){
        String answer = Greenfoot.ask("What animal is best at hitting a baseball?");
          if(answer.equalsIgnoreCase("bat")){
              getWorld().removeObject(this);
              YouWin youWin = new YouWin();
              Greenfoot.setWorld(youWin);
          }
          else{
              ZGameOver_final gameOver = new ZGameOver_final();
              Greenfoot.setWorld(gameOver);
          }
        
    }
    /**
     * Act - do whatever the FinalBoss wants to do. This method is called whenever
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
