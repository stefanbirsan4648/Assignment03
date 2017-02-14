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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Creating a new City Called Kitchener
        

       City kitchener = new City ();
       
        //Creating a Robot
        
        Robot romo = new Robot (kitchener,0,0,Direction.SOUTH); 
      
        //Creting a second robot
        Robot romo1 = new Robot (kitchener,0,1,Direction.SOUTH); 
        
        //Creating Walls
        
        new Wall(kitchener,0,1,Direction.WEST);
        new Wall(kitchener,1,1,Direction.WEST); 
        new Wall(kitchener,1,1,Direction.SOUTH); 
        
        //Making the Robots Move
         romo.move();
         romo.move();
         
         romo1.move();
         romo1.turnLeft();
         romo1.move();
         
         romo.turnLeft();
         
          romo1.turnLeft();
          romo1.turnLeft();
          romo1.turnLeft();
          romo1.move();
          romo1.turnLeft();
          romo1.turnLeft();
          romo1.turnLeft();
          romo1.move();
              
          romo.move();
          
          
               
          
          
          
             
            
         
          
        
        
        
        
         
    }
}
