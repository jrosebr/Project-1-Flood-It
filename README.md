FloodIt! Student Support Code

Question 1:
The function f(n) = n^2 fits the graph of my flood function

Question 2:
I got O(n^2) because my flood function will loop through the flooded_list n times, and then it will check
if the Coord's neighbors are already in the flooded_list (.contains() function)

(i.e., There is an O(n) function activating inside an O(n) loop = O(n) * O(n) = O(n^2)

Question 3:
Yes,
Graph: f(n) = n^2
My Analysis: O(n^2)

Question 4:
I used Linked_Lists in my function. I would loop through each value in the flooded_list and get all possible neighbors of the Coordinates.
Then, I would check if the flooded_list already contains the neighboring coordinates.
If not, then I check if the neighboring coordinates' tile is the same color as the player's chosen color.
If true, then I will add that tile's coordinates to the flooded_list.

The time complexity is not the best it can be. The loop will have to recheck the same coordinates in order to get the new coordinates at the end, wasting time.

Instead of looping through every single value in the list, I'll try to make it so the function will loop through the newly added coordinates.
Maybe by using HashMaps or creating a list of the new coordinates after they've been added, and only checking those coordinates.

Question 5:
I think the time complexity of my flood1 function is O(n).

Revision: Fall 2023