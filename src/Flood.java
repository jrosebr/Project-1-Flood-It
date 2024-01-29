// Imports for the parameters of flood

import java.util.*;


public class Flood {

    // Students implement this flood function.
    public static void flood(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles, Integer board_size) {

        for (int i = 0; i < flooded_list.size(); ++i)
        {
            List<Coord> neighbors = flooded_list.get(i).neighbors(board_size);

            for (Coord tile : neighbors)
            {
                if (!flooded_list.contains(tile))
                {
                    if (Board.get(tile).getColor().equals(color))
                    {
                        flooded_list.add(tile);
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
        // Hashmaps instead of contains()!!!
    }

}
