import greenfoot.*;

/**
 * Write a description of class CharacterDirection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum CharacterDirection  
{
    UP,
    DOWN,
    LEFT,
    RIGHT;
    
    public static CharacterDirection getRandomDirection(){
        switch(Greenfoot.getRandomNumber(4)){
            case 0:
                return UP;
            case 1:
                return DOWN;
            case 2:
                return LEFT;
        }
        return RIGHT;
    }
}
