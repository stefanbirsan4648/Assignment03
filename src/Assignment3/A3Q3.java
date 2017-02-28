/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.*;

/**
 *
 * @author birss0828
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city called kitchener

        City kitchener = new City(4, 7);

        //create robot named romo

        Robot romo = new Robot(kitchener, 1, 1, Direction.EAST);

        //creating walls

        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 3, 1, Direction.WEST);
        new Wall(kitchener, 3, 1, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);

        //creating things

        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 2, 3);
        new Thing(kitchener, 2, 4);
        new Thing(kitchener, 3, 1);
        new Thing(kitchener, 3, 4);

        while (romo.frontIsClear()) {
            romo.move();
            if (romo.canPickThing()) {
                romo.pickThing();

            }
            if (!romo.frontIsClear()) {
                if (romo.getDirection() == Direction.EAST) {
                    romo.turnLeft();
                }
                romo.turnLeft();
                romo.turnLeft();
                if (romo.frontIsClear()) {
                    romo.move();
                    romo.turnLeft();
                    romo.turnLeft();
                    romo.turnLeft();
                }
            } else if (romo.getDirection() == Direction.WEST) {
                romo.turnLeft();
                romo.move();
                romo.turnLeft();
            }

            if (romo.canPickThing()) {
                romo.pickThing();
            }
        }
        while (romo.getDirection() != Direction.WEST) {

            while (romo.getAvenue() != 1) {

                while (romo.getDirection() != Direction.NORTH) {

                    while(romo.getStreet() != 1)
                    {
                       

                        romo.turnLeft();
                        romo.turnLeft();
                        romo.turnLeft();

                    }
                }
            }
        }
    }
}
