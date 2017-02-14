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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Creating a new City Called Kitchener
        

       City kitchener = new City ();
       
        //Creating a Robot
        
        Robot romo = new Robot (kitchener,0,1,Direction.WEST); 
        
        //Creating a new Robot for Maria
         Robot romo1 = new Robot (kitchener,3,3,Direction.EAST); 
         
         //Labeling the Robots
         romo1.setLabel("R");
         romo.setLabel("M");
         
         //Creating Walls
         
          new Wall(kitchener,2,3,Direction.WEST);
          new Wall(kitchener,2,3,Direction.NORTH);
          new Wall(kitchener,2,3,Direction.EAST);
          new Wall(kitchener,3,3,Direction.EAST);
          new Wall(kitchener,3,3,Direction.SOUTH);
          
          //Creating Things for The Robots
          
           new Thing(kitchener,0,0);
           new Thing(kitchener,1,0);
           new Thing(kitchener,1,1);
           new Thing(kitchener,1,2);
           new Thing(kitchener,2,2);
           
           //Making the Robots to move
          
           romo.move();
           romo.pickThing();
           romo.turnLeft();
           romo.move();
           romo.pickThing();
           romo.turnLeft();
           romo.move();
           romo.pickThing();
           
           romo1.turnLeft();
           romo1.turnLeft();
      
           romo1.move();
           romo1.turnLeft();
           romo1.turnLeft();
           romo1.turnLeft();
           romo1.move();
           romo1.pickThing();
           romo1.move();
           romo1.pickThing();
           romo1.turnLeft();
           
           
            
           
              
              
              
             
           
           
                
             
            
           
            
           
            
           
             
            
           
           
           
           
            
           
          
           
          
           
           
          
          
          
         
         
         
        
      
    }
}
