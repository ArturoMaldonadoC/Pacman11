/**
 * Write a description of class PacmanGoogleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanGoogleMapLoader implements StaticMapLoader 
{
    public Map loadMap()
    {
        Map map = new Map();

        addWalls(map);

        addSmallItems(map);

        addPowerItems(map);
        
        map.addObject(new PacMan(), map.getWidth()/2, map.getHeight() - 210);
        
        map.addObject(new RedPhantom(), map.getWidth()/2, 210);
        
        map.addObject(new BluePhantom(), map.getWidth()/2 - 50, map.getHeight()/2);
        
        map.addObject(new PinkPhantom(), map.getWidth()/2, map.getHeight()/2);
        
        map.addObject(new OrangePhantom(), map.getWidth()/2 + 50, map.getHeight()/2);

        return map;
    }

    void addWalls(Map map)
    {
   
        for (int i = 0 ; i <= map.getWidth() ; i+=50){
            map.addObject(new Wall(), i, 25);
            map.addObject(new Wall(), i, map.getHeight()-25);
        }
        
        for(int i = 75 ; i < map.getHeight()-25 ; i+=50){
            map.addObject(new Wall(), 25, i);
            map.addObject(new Wall(), map.getWidth()-25, i);;
        }
        
        
        map.addObject(new Wall(), map.getWidth()/2, map.getHeight()-75);
        map.addObject(new Wall(), map.getWidth()/2, map.getHeight()-125);
        
        map.addObject(new Wall(), map.getWidth()/5, 150);
        map.addObject(new Wall(), map.getWidth()/5+50, 150);
        map.addObject(new Wall(), map.getWidth()/5+100, 150);
        
        map.addObject(new Wall(), (map.getWidth()/7)*5-25, map.getHeight()-175);
        map.addObject(new Wall(), (map.getWidth()/7)*5+25, map.getHeight()-175);
        map.addObject(new Wall(), (map.getWidth()/7)*5+75, map.getHeight()-175);
       
        map.addObject(new Wall(), map.getWidth()/5, 350);
        map.addObject(new Wall(), map.getWidth()/5, 500);
       
        map.addObject(new Wall(), (map.getWidth()/7)*5+75, 500);
        map.addObject(new Wall(), (map.getWidth()/7)*5+75, 650);
    }

    void addSmallItems(Map map)
    {
        for(int x = 100; x < 500; x+=40) {
            map.addObject(new SmallPoint(), x + 30, 90);
            map.addObject(new SmallPoint(), map.getWidth() - x - 30 , 90);
            
            map.addObject(new SmallPoint(), x + 200, 210);
            
            map.addObject(new SmallPoint(), x, map.getHeight()/2);
            map.addObject(new SmallPoint(), map.getWidth() - x, map.getHeight()/2);
            
            map.addObject(new SmallPoint(), x + 30, map.getHeight() - 90);
            map.addObject(new SmallPoint(), map.getWidth() - x - 30 , map.getHeight() - 90);
            
            
            map.addObject(new SmallPoint(),100, x +30);
            map.addObject(new SmallPoint(),map.getWidth() - 100, x +30);
            
            map.addObject(new SmallPoint(),100, map.getHeight() - x - 30);
            map.addObject(new SmallPoint(),map.getWidth() - 100, map.getHeight() - x - 30);
        }
    }

    void addPowerItems(Map map)
    {
        map.addObject(new PowerPoint(), 95, 90);
        map.addObject(new PowerPoint(), map.getWidth()-95, 90);
        map.addObject(new PowerPoint(), 100, map.getHeight()-90);
        map.addObject(new PowerPoint(), map.getWidth()-100, map.getHeight()-90);
    }

}
