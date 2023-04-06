package maze;

import java.util.List;

public class dfs {
	
	public static boolean searchpath(int maze[][], int x, int y, List<Integer> path)
	{
		if(maze[y][x] == 9)// destination
		{
			path.add(x);
			path.add(y);
			return true;
		}
		if(maze[y][x] == 0)
		{
			maze[y][x] = 2;// making it 2 means marking it as visited
			int dx = -1; // moving in 1st direction
			int dy = 0;
			if (searchpath(maze,x+dx, y+dy,path)) // do minus one from x axis at which we are standing -> moving left
			{
				path.add(x);
				path.add(y);
				return true;
			}
			dx = 1;// moving in 2nd direction
			dy = 0;
			if (searchpath(maze,x+dx, y+dy,path)) //do plus one from x axis at which we are standing -> moving right
			{
				path.add(x);
				path.add(y);
				return true;
			}
			dx = 0; // moving in 3rd direction
			dy = -1;
			if (searchpath(maze,x+dx, y+dy,path))
			{
				path.add(x);
				path.add(y);
				return true;
			}
			dx = 0; // moving in 4th direction
			dy = 1;
			if (searchpath(maze,x+dx, y+dy,path))
			{
				path.add(x);
				path.add(y);
				return true;
			}
		}
		return false;
		
	}


}
