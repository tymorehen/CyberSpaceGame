  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
   public void printToScreen(String text,  int x, int y)
    {
     GreenfootImage letters = new GreenfootImage(text, 25, Color.BLACK, new Color(0, 0, 0, 0));
     getWorld().getBackground().drawImage(letters, (getWorld().getWidth()-letters.getWidth())/2, y); 
     
   }
   public void pause(int delay)
   {
 
   }
   public void act()
   {
       printToScreen("Hello world, this is just a test demo. Please don't mind the weird font:"0,0);
   }   
}
