/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating a new City called Kitchener
        
        City kitchener = new City (); 
        
        //Creating a Robot
        
        Robot romo = new Robot (kitchener,1,2,Direction.SOUTH); 
        
        // Creating Walls for the robot
        
        new Wall(kitchener,1,1,Direction.NORTH);  
        new Wall(kitchener,1,2,Direction.NORTH);
        new Wall(kitchener,1,2,Direction.EAST);
        new Wall(kitchener,1,2,Direction.SOUTH);
        new Wall(kitchener,1,1,Direction.WEST);
        new Wall(kitchener,2,1,Direction.WEST);
        new Wall(kitchener,2,1,Direction.SOUTH);
        
        //Creating Thing for Robot
        
        new Thing(kitchener,2,2);
        
        //Directing the robot where to go
        
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.move();
        romo.pickThing();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        
           
           
     
        
        
        
           
       
    
    
    
}
