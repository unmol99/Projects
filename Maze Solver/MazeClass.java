package maze;
import javax.swing.JFrame;
import java.util.*;
import java.util.List;
import java.awt.*;

public class MazeClass extends JFrame {
	
	private int [][] maze = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,1,0,1,0,0,0,0,0,1},
			{1,0,1,0,0,0,1,0,1,1,1,0,1},
			{1,0,1,1,1,1,1,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,1,1,1,0,1},
			{1,0,1,0,1,1,1,0,1,0,0,0,1},
			{1,0,1,0,1,0,0,0,1,1,1,0,1},
			{1,0,1,0,1,1,1,0,1,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,9,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1}
	
	};
	
	public List<Integer> path = new ArrayList<>(); // store path
	
	public MazeClass() // constructor
	{
		setTitle("Maze Solver");// title of frame
		setSize(640,640); // size of frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops running app when clicked on close
		dfs.searchpath(maze, 1, 1, path);
	}
	
	@Override
	public void paint(Graphics g) // Painting grid [Array]
	{
		g.translate(50, 50);// places the graphic in desired location in panel
		for(int i = 0; i< maze.length; i++)
		{
			for(int j= 0; j< maze[0].length; j++)
			{
				Color color; // declare color
				switch (maze[i][j])
				{
				case 1: color = Color.BLACK;break; // for 1 in grid sets white
				case 9: color = Color.GREEN;break; // for 9 in green sets Green
				default: color = Color.WHITE;break; // same for default sets black
				}
				g.setColor(color);
				g.fillRect(30*j, 30*i, 30, 30); // fills rectangle grids with assigned colors as per respective values mentioned above
				g.setColor(Color.YELLOW);
				g.drawRect(30*j, 30*i, 30, 30);
			}
			

			}
		for(int i = 0; i<path.size(); i += 2)
		{
			int pathx = path.get(i);
			int pathy = path.get(i+1);
			g.setColor(Color.CYAN);
			g.fillOval(30*pathx, 30*pathy, 20, 20);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazeClass view = new MazeClass();
		view.setVisible(true);

	}

}
