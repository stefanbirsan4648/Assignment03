/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a new City called Kitchener
        
        City kitchener = new City ();
        
        //Creating a Robot
       
        Robot romo = new Robot (kitchener,0,2,Direction.WEST);
        
        //Creating Wall for the Robot
        new Wall(kitchener,1,1,Direction.WEST);
        new Wall(kitchener,2,1,Direction.WEST);
        new Wall(kitchener,1,1,Direction.NORTH);
        new Wall(kitchener,1,2,Direction.NORTH); 
        new Wall(kitchener,1,2,Direction.EAST);
        new Wall(kitchener,2,2,Direction.EAST);
        new Wall(kitchener,2,1,Direction.SOUTH);
        new Wall(kitchener,2,2,Direction.SOUTH);
        
        //Directs the Robot where to go
        
        romo.move();
        romo.move();
        romo.turnLeft();
        romo.move();
        romo.move();
        romo.move();
        romo.turnLeft();
        romo.move();
        romo.move();
        romo.move();
        romo.turnLeft();
        romo.move();
        romo.move();
        romo.move();
        romo.turnLeft();
        romo.move();
        
        
        
}
}
