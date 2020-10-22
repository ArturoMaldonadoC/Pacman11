import java.util.Random;

/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Person 
{
    private PhantomState phantomState;
    
    public Phantom()
    {
        phantomState = PhantomState.NORMAL;
    }
    
    CharacterDirection getRandomDirection(){
        
        Random rand = new Random();
        int randomDirection = rand.nextInt(4);
        CharacterDirection direction = CharacterDirection.RIGHT;
        
        switch(randomDirection){
            case 0:
                direction = CharacterDirection.UP;
            break;
            case 1:
                direction = CharacterDirection.DOWN;
            break;
            case 2:
                direction = CharacterDirection.LEFT;
            break;
        }
        return direction;
    }
    
    CharacterDirection changeDirection(CharacterDirection currentDirection){
        CharacterDirection newDirection = getRandomDirection();
        
        while(currentDirection == newDirection){
            newDirection = getRandomDirection();
        }
        
        return newDirection;
    }
    
}
