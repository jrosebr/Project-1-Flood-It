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

            for (Coord tile : neighbors)
            {
                if (!flooded_list.contains(tile))
                {
                    if (tiles[tile.getY()][tile.getX()].getColor().equals(color))
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

        //List of Visited Coordinates
        boolean[][] visited = new boolean[board_size][board_size];

        //Queue of newly added tiles
        Queue<Coord> queue = new LinkedList<>();

        for (Coord coord : flooded_list)
        {
            queue.offer(coord);
            visited[coord.getX()][coord.getY()] = true;
        }

        while (!queue.isEmpty())
        {
            Coord current = queue.poll();
            List<Coord> neighbors = current.neighbors(board_size);

            for (Coord neighbor : neighbors)
            {
                int x = neighbor.getX();
                int y = neighbor.getY();

                if (!visited[x][y] && tiles[x][y].getColor().equals(color))
                {
                    flooded_list.add(neighbor);
                    queue.offer(neighbor);
                    visited[x][y] = true;
                }
            }
        }
    }

}
