// Imports for the parameters of flood

import java.util.*;


public class Flood {

    // Students implement this flood function.
    public static void flood(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles,
                              Integer board_size) {

        for (int i = 0; i < flooded_list.size(); ++i)
        {
            //Get Coord's Neighbors
            List<Coord> neighbors = flooded_list.get(i).neighbors(board_size);

            for (int j = 0; j < neighbors.size(); ++j)
            {
                //Check if Coordinates are already in Flooded List
                if (!flooded_list.contains(neighbors.get(j)))
                {
                    if (Board.get(neighbors.get(j)).getColor().equals(color))
                    {
                        flooded_list.add(neighbors.get(j));
                    }
                }

                //System.out.println(neighbors.get(j));
            }
            Coord c = new Coord(5,5);
            System.out.println(c.neighbors(board_size));
        }

    }

    // An alternative implementation goes here.
    public static void flood1(WaterColor color,
                             LinkedList<Coord> flooded_list,
                             Tile[][] tiles,
                             Integer board_size) {
        // YOUR CODE
    }

}
