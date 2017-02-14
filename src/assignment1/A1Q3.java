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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
 
         //Creating a new City called Kitchener
        
        City kitchener = new City ();
        
         //Creating a Robot
        
        Robot romo = new Robot (kitchener,3,0,Direction.EAST); 
        
        //Creating Thing for Robot
        
         new Thing(kitchener,3,1);
         
         //Creating Walls for robot
         
          new Wall(kitchener,3,2,Direction.WEST);  
          new Wall(kitchener,3,2,Direction.NORTH); 
          new Wall(kitchener,2,3,Direction.WEST);
          new Wall(kitchener,1,3,Direction.WEST); 
          new Wall(kitchener,1,3,Direction.NORTH); 
          new Wall(kitchener,1,3,Direction.EAST);
          new Wall(kitchener,2,4,Direction.NORTH);
          new Wall(kitchener,2,4,Direction.EAST);  
          new Wall(kitchener,3,4,Direction.EAST);
          
          //Directing The Robot Where To Go
           romo.move();
           romo.pickThing();
           romo.turnLeft();
           romo.move();
           romo.turnLeft();
           romo.turnLeft();
           romo.turnLeft();
           romo.move();
           romo.turnLeft();
           romo.move();
           romo.move();
           romo.turnLeft();
           romo.turnLeft();
           romo.turnLeft();
           romo.move();
           romo.putThing();
           romo.move();
           romo.turnLeft();
           romo.turnLeft();
           romo.turnLeft();
           romo.move();
           romo.turnLeft();
           romo.move();
           romo.turnLeft();
           romo.turnLeft();
           romo.turnLeft();
           romo.move();
           romo.move();
           romo.turnLeft();
           
           
             
           
            
           
            
           
           
           
                 
           
           
           
           
              
           
               
           
           
           
              
           
           
           
           
           
           
          
          
          
          
          
          
          
         
         
        
        
        
        
        
        
    
    }
    
    
}
