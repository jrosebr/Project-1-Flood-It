// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {

    // Students implement this flood function.
    public static void flood(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles,
                              Integer board_size)
    {
        for (int i = 0; i < flooded_list.size(); ++i)
        {
            List<Coord> neighbors = flooded_list.get(i).neighbors(board_size);

            for (int j = 0; j < neighbors.size(); ++j)
            {
                if (!flooded_list.contains(neighbors.get(j)))
                {
                    if (Board.get(neighbors.get(j)).getColor().equals(color))
                    {
                        flooded_list.add(neighbors.get(j));
                    }
                }
            }
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
