import greenfoot.*;

/**
 * Write a description of class OrangePhantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangePhantom extends Phantom
{
    private int movementInX;
    private int movementInY;
    
    public OrangePhantom(){
        setImage(new GreenfootImage("images/orange-phantom-left.png"));
        
        direction = getRandomDirection();
    }
    
    public void act(){
        
        setLocation(getX() + movementInX, getY() + movementInY);
        
        movePhantom();
        
        checkCollisions();
    }
    
    
    void movePhantom(){
        movementInX = 0;
        movementInY = 0;
        
        switch(direction){
        case UP:
            movementInY = -1;
        break;
        case DOWN:
            movementInY = 1;
        break;
        case LEFT:
            movementInX = -1;
        break;
        case RIGHT:
            movementInX = 1;
        break;
        }
    }
    
    void checkCollisions()
    {
        Wall wall = null; 
        switch(direction)
        {
            case UP:
                wall = (Wall)getOneObjectAtOffset(0, -20, Wall.class);
            break;
            case DOWN:
                wall = (Wall)getOneObjectAtOffset(0, 20, Wall.class);
            break;
            case RIGHT:
                wall = (Wall)getOneObjectAtOffset(20, 0, Wall.class);
            break;
            case LEFT:
                wall = (Wall)getOneObjectAtOffset(-20, 0, Wall.class);
            break;
        }
        
        if(wall != null || isAtEdge())
        {
            direction = changeDirection(direction);
        }
    }
}
