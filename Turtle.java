import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{

    // Number of frames/acts between animation images.
    final int ANIMATION_INTERVAL = 3;
    
    // frame counter
    int frameCounter = 0;
    
    // movement speed.
    final int SPEED_X = 3;
    
    // movement variables
    int deltaX;
    int deltaY;
    
    // variable to remember what way the idle animation should be.
    boolean isFacingRight = true;
    
    boolean isFacingUp = true;
    
    // animation images
    
    // idle image right
    GreenfootImage imageavatar_idle7;
    
    // idle image left
    GreenfootImage imageavatar_idleleft7;
    
    // move left images
    GreenfootImage imageavatar_left0;
    GreenfootImage imageavatar_left1;
    GreenfootImage imageavatar_left2;
    GreenfootImage imageavatar_left3;
    GreenfootImage imageavatar_left4;
    GreenfootImage imageavatar_left5;
    GreenfootImage imageavatar_left6;
    GreenfootImage imageavatar_left7;
    
    // move right images
    GreenfootImage imageavatar_right0;
    GreenfootImage imageavatar_right1;
    GreenfootImage imageavatar_right2;
    GreenfootImage imageavatar_right3;
    GreenfootImage imageavatar_right4;
    GreenfootImage imageavatar_right5;
    GreenfootImage imageavatar_right6;
    GreenfootImage imageavatar_right7;
    
    // move up images
    GreenfootImage imageavatar_up0;
    GreenfootImage imageavatar_up1;
    GreenfootImage imageavatar_up2;
    GreenfootImage imageavatar_up3;
    GreenfootImage imageavatar_up4;
    GreenfootImage imageavatar_up5;
    
    // move down images
    GreenfootImage imageavatar_down0;
    GreenfootImage imageavatar_down1;
    GreenfootImage imageavatar_down2;
    GreenfootImage imageavatar_down3;
    GreenfootImage imageavatar_down4;
    
    public Turtle()
    {
        // load images
        
        // load left images
        imageavatar_left0 = new GreenfootImage("Robot Frames/Left/avatar_left0.png");
        imageavatar_left1 = new GreenfootImage("Robot Frames/Left/avatar_left1.png");
        imageavatar_left2 = new GreenfootImage("Robot Frames/Left/avatar_left2.png");
        imageavatar_left3 = new GreenfootImage("Robot Frames/Left/avatar_left3.png");
        imageavatar_left4 = new GreenfootImage("Robot Frames/Left/avatar_left4.png");
        imageavatar_left5 = new GreenfootImage("Robot Frames/Left/avatar_left5.png");
        imageavatar_left6 = new GreenfootImage("Robot Frames/Left/avatar_left6.png");
        imageavatar_left7 = new GreenfootImage("Robot Frames/Left/avatar_left7.png");
        
        // load right images
        imageavatar_right0 = new GreenfootImage("Robot Frames/Right/avatar_right0.png");
        imageavatar_right1 = new GreenfootImage("Robot Frames/Right/avatar_right1.png");
        imageavatar_right2 = new GreenfootImage("Robot Frames/Right/avatar_right2.png");
        imageavatar_right3 = new GreenfootImage("Robot Frames/Right/avatar_right3.png");
        imageavatar_right4 = new GreenfootImage("Robot Frames/Right/avatar_right4.png");
        imageavatar_right5 = new GreenfootImage("Robot Frames/Right/avatar_right5.png");
        imageavatar_right6 = new GreenfootImage("Robot Frames/Right/avatar_right6.png");
        imageavatar_right7 = new GreenfootImage("Robot Frames/Right/avatar_right7.png");
        
        // load idle image right
        imageavatar_idle7 = new GreenfootImage("Robot Frames/Idle/avatar_idle7.png");
    
        // load idle image left
        imageavatar_idleleft7 = new GreenfootImage("Robot Frames/Idle/avatar_idle7.png");
        
        // mirror idle left
        imageavatar_idleleft7.mirrorHorizontally();
        
        // load up images
        imageavatar_up0 = new GreenfootImage("Robot Frames/Up/avatar_up0.png");
        imageavatar_up1 = new GreenfootImage("Robot Frames/Up/avatar_up1.png");
        imageavatar_up2 = new GreenfootImage("Robot Frames/Up/avatar_up2.png");
        imageavatar_up3 = new GreenfootImage("Robot Frames/Up/avatar_up3.png");
        imageavatar_up4 = new GreenfootImage("Robot Frames/Up/avatar_up4.png");
        imageavatar_up5 = new GreenfootImage("Robot Frames/Up/avatar_up5.png");
        
        // load down images
        imageavatar_down0 = new GreenfootImage("Robot Frames/Down/avatar_down0.png");
        imageavatar_down1 = new GreenfootImage("Robot Frames/Down/avatar_down1.png");
        imageavatar_down2 = new GreenfootImage("Robot Frames/Down/avatar_down2.png");
        imageavatar_down3 = new GreenfootImage("Robot Frames/Down/avatar_down3.png");
        imageavatar_down4 = new GreenfootImage("Robot Frames/Down/avatar_down4.png");
                
    }

    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // movement keys
        GreenfootImage image = getImage();

        // collision detection
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

        // stop game if touching enemy
        if (isTouching(Enemy.class))
        {
            Greenfoot.stop();
        }
        movementControls();
        animate();
        
    }
    
    public void movementControls()
    {
        deltaX = 0;
        deltaY = 0;
        
        // movement keys
        
        // left movement
        if (Greenfoot.isKeyDown("left"))
        {
            deltaX = deltaX - SPEED_X;
            animateLeft();      
        }  
        // right movement
        if (Greenfoot.isKeyDown("right"))
        {
            deltaX = deltaX + SPEED_X;
            animateRight();
        }
        // down movement
        if (Greenfoot.isKeyDown("down"))
        {
            deltaY = deltaY + SPEED_X;
            animateDown();
        }
        // up movement
        if (Greenfoot.isKeyDown("up"))
        {
            deltaY = deltaY - SPEED_X;
            animateUp();
        }
        
        setLocation(getX() + deltaX, getY() + deltaY);
        
        // remember wether facing right or left
        if (deltaX > 0)
        {
            isFacingRight = true;
        }
        else if (deltaX < 0)
        {
            isFacingRight = false;
        }
        
    }
    
    public void animate()
    {
        
        if (deltaY == 0 && deltaX == 0) // if not jumping/running/falling.
        {
            if (isFacingRight == true)
            {
                setImage(imageavatar_idle7);
            }
            else
            {
                setImage(imageavatar_idleleft7);
            }
        }
        
        if (deltaX > 0) // if moving right
        {
            animateRight();
        }
        else if (deltaX < 0) // if moving left
        {
            animateLeft();
        }
        
        if (deltaY < 0) // if moving up
        {
            animateUp();
        }
        else if (deltaY > 0) // if moving down
        {
            animateDown();
        }
        
        // increment frame counter
        frameCounter++;

        setLocation(getX() + deltaX, getY() + deltaY);      
    }
    
    public void animateRight()
    {
        // cycle images through frames.
        if (frameCounter >= 8 * ANIMATION_INTERVAL)
        {
            // Reset to 0.
            frameCounter = 0;
        }
        
        if(frameCounter == 0)
        {
            setImage(imageavatar_right0);
        }
        else if (frameCounter == 1 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right1);
        }
        else if (frameCounter == 2 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right2);
        }
        else if (frameCounter == 3 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right3);
        }
        else if (frameCounter == 4 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right4);
        }
        else if (frameCounter == 5 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right5);
        }
        else if (frameCounter == 6 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right6);
        }
        else if (frameCounter == 7 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_right7);
        }
    }
    
    public void animateLeft()
    {
        // cycle images through frames.
        if (frameCounter >= 8 * ANIMATION_INTERVAL)
        {
            // Reset to 0.
            frameCounter = 0;
        }
        
        if(frameCounter == 0)
        {
            setImage(imageavatar_left0);
        }
        else if (frameCounter == 1 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left1);
        }
        else if (frameCounter == 2 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left2);
        }
        else if (frameCounter == 3 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left3);
        }
        else if (frameCounter == 4 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left4);
        }
        else if (frameCounter == 5 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left5);
        }
        else if (frameCounter == 6 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left6);
        }
        else if (frameCounter == 7 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_left7);
        }
    }
    
    public void animateUp()
    {
        // cycle images through frames.
        if (frameCounter >= 6 * ANIMATION_INTERVAL)
        {
            // Reset to 0.
            frameCounter = 0;
        }
        if (frameCounter == 0)
        {
            setImage(imageavatar_up0);
        }   
        else if (frameCounter == 1 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_up1);
        }
        else if (frameCounter == 2 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_up2);
        }
        else if (frameCounter == 3 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_up3);
        }
        else if (frameCounter == 4 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_up4);
        }
        else if (frameCounter == 5 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_up5);
        }
        
    }
    
    public void animateDown()
    {
        // cycle images through frames.
        if (frameCounter >= 5 * ANIMATION_INTERVAL)
        {
            // Reset to 0.
            frameCounter = 0;
        }
        if (frameCounter == 0)
        {
            setImage(imageavatar_down0);
        }   
        else if (frameCounter == 1 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_down1);
        }
        else if (frameCounter == 2 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_down2);
        }
        else if (frameCounter == 3 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_down3);
        }
        else if (frameCounter == 4 * ANIMATION_INTERVAL)
        {
            setImage(imageavatar_down4);
        }

    }
}

