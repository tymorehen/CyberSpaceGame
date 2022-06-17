import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    
    // number of frames/acts between animation images.
    final int ANIMATION_INTERVAL = 3;
    
    // frame counter
    int frameCounter = 0;

    // variable to remember what way the animation should be.
    boolean isFacingRight = true;
    
    
    // animation images
    
    // animation left
    GreenfootImage imageenemy_left0;
    GreenfootImage imageenemy_left1;
    GreenfootImage imageenemy_left2;
    GreenfootImage imageenemy_left3;
    GreenfootImage imageenemy_left4;
    GreenfootImage imageenemy_left5;
    GreenfootImage imageenemy_left6;
    
    // animation right
    GreenfootImage imageenemy_right0;
    GreenfootImage imageenemy_right1;
    GreenfootImage imageenemy_right2;
    GreenfootImage imageenemy_right3;
    GreenfootImage imageenemy_right4;
    GreenfootImage imageenemy_right5;
    GreenfootImage imageenemy_right6;
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // make enemy follow player
        follow();
        // collision detection
        collisionDetection();
        // cycle through animation images
        animate();
    }
    
    public void follow()
    {
        Actor turtle = (Actor)getWorld().getObjects(Turtle.class).get(0);
        turnTowards(turtle.getX(), turtle.getY());
        move(2);
        setRotation(0);
        if (getWorld().getObjects(Turtle.class).isEmpty()) return;
        
        
        if (this.getX() < turtle.getX())
        {
            isFacingRight = true;
        }
        
        if (this.getX() > turtle.getX())
        {
            isFacingRight = false;
        }
    }
    
    public void collisionDetection()
    {
        Actor obstacleRight = getOneObjectAtOffset(getImage().getWidth()/2, 0, Obstacle.class);
          
        Actor obstacleLeft = getOneObjectAtOffset(-getImage().getWidth()/2, 0, Obstacle.class);
        
        Actor obstacleUp = getOneObjectAtOffset(0, getImage().getHeight()/2, Obstacle.class);
        
        Actor obstacleDown = getOneObjectAtOffset(0, -getImage().getHeight()/2, Obstacle.class);
        
        if (obstacleRight != null) {
            setLocation(obstacleRight.getX() - obstacleRight.getImage().getWidth()/2 - getImage().getWidth()/2, getY());
        }
        if (obstacleLeft != null) {
            setLocation(obstacleLeft.getX() + obstacleLeft.getImage().getWidth()/2 + getImage().getWidth()/2, getY());
        }
        if (obstacleUp != null) {
            setLocation( getX() ,obstacleUp.getY() - obstacleUp.getImage().getHeight()/2 - getImage().getHeight()/2);
        }
        if (obstacleDown != null) {
            setLocation( getX() ,obstacleDown.getY() + obstacleDown.getImage().getHeight()/2 + getImage().getHeight()/2);
        }
    }
    
    public Enemy()
    {
        // load animation images
        
        // load left animation images
        imageenemy_left0 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left0.png");
        imageenemy_left1 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left1.png");
        imageenemy_left2 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left2.png");
        imageenemy_left3 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left3.png");
        imageenemy_left4 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left4.png");
        imageenemy_left5 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left5.png");
        imageenemy_left6 = new GreenfootImage("Enemy Robot Frames/Left/enemy_left6.png");
        
        // load right animation images
        imageenemy_right0 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right0.png");
        imageenemy_right1 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right1.png");
        imageenemy_right2 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right2.png");
        imageenemy_right3 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right3.png");
        imageenemy_right4 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right4.png");
        imageenemy_right5 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right5.png");
        imageenemy_right6 = new GreenfootImage("Enemy Robot Frames/Right/enemy_right6.png");
    }
    
    public void animate()
    {
        // decide wether animating left or right
        if (isFacingRight == true) // if moving right
        {
            animateRight();
        }
        
        else if (isFacingRight == false) // if moving left
        {
            animateLeft();
        }
        // increment frame counter
        frameCounter++;  
    }
    
    public void animateRight()
    {
       // cycle images through frames.
        if (frameCounter >= 7 * ANIMATION_INTERVAL)
        {
            // Reset to 0.
            frameCounter = 0;
        }
        
        if(frameCounter == 0)
        {
            setImage(imageenemy_right0);
        }
        else if (frameCounter == 1 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_right1);
        }
        else if (frameCounter == 2 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_right2);
        }
        else if (frameCounter == 3 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_right3);
        }
        else if (frameCounter == 4 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_right4);
        }
        else if (frameCounter == 5 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_right5);
        }
        else if (frameCounter == 6 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_right6);
        } 
    }
    
    public void animateLeft()
    {
        // cycle images through frames.
        if (frameCounter >= 7 * ANIMATION_INTERVAL)
        {
            // Reset to 0.
            frameCounter = 0;
        }
        
        if(frameCounter == 0)
        {
            setImage(imageenemy_left0);
        }
        else if (frameCounter == 1 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_left1);
        }
        else if (frameCounter == 2 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_left2);
        }
        else if (frameCounter == 3 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_left3);
        }
        else if (frameCounter == 4 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_left4);
        }
        else if (frameCounter == 5 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_left5);
        }
        else if (frameCounter == 6 * ANIMATION_INTERVAL)
        {
            setImage(imageenemy_left6);
        }
    }
}
