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
        
        map.addObject(new PacMan(), 50, 150);
        
        map.addObject(new BluePhantom(), 380, 350);
        
        map.addObject(new OrangePhantom(), 400, 370);
        
        map.addObject(new PinkPhantom(), 420, 350);
        
        map.addObject(new RedPhantom(), 400, 330);

        return map;
    }

    void addWalls(Map map)
    {
        map.addObject(new Wall(), 50, 50);
        map.addObject(new Wall(), 100, 50);
        map.addObject(new Wall(), 150, 50);
        map.addObject(new Wall(), 200, 50);
        map.addObject(new Wall(), 250, 50);

        map.addObject(new Wall(), 300, 150);
        map.addObject(new Wall(), 300, 200);
        map.addObject(new Wall(), 300, 250);
        map.addObject(new Wall(), 300, 400);
        map.addObject(new Wall(), 300, 450);
        map.addObject(new Wall(), 300, 500);

        map.addObject(new Wall(), 450, 650);
        map.addObject(new Wall(), 500, 650);
        map.addObject(new Wall(), 550, 650);
        map.addObject(new Wall(), 600, 650);
        map.addObject(new Wall(), 650, 650);
    }

    void addSmallItems(Map map)
    {
        for(int x = 50; x < 600; x+=20) {
            map.addObject(new SmallPoint(), x, 320);
        }
    }

    void addPowerItems(Map map)
    {
        map.addObject(new PowerPoint(), 50, 350);
        map.addObject(new PowerPoint(), 100, 550);
        map.addObject(new PowerPoint(), 650, 350);
        map.addObject(new PowerPoint(), 650, 550);
        map.addObject(new PowerPoint(), 700, 100);

    }

}
