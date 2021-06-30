import java.awt.Color;
import java.awt.Graphics2D;

public class GameManager 
{
	private int SCREEN_WIDTH;
	private int SCREEN_HEIGHT;
	
	private int circleX, circleY;
	private int circleRadius = 10;
	
	private int speed = 4;
	
	private boolean up, left, down, right;
	
	public GameManager(int input_width, int input_height)
	{
		SCREEN_WIDTH = input_width;
		SCREEN_HEIGHT = input_height;
		circleX = SCREEN_WIDTH/2;
		circleY = SCREEN_HEIGHT/2;
		
		up = false;
		left = false;
		down = false;
		right = false;
	}
	
	public void render(Graphics2D g2d)
	{
		g2d.setColor(Color.CYAN);
		g2d.fillOval(circleX - circleRadius, circleY - circleRadius, 2*circleRadius, 2*circleRadius);
	}
	
	public void tick()
    {
		if(up)
		{
			moveUp(speed);
		}
		if(down)
		{
			moveDown(speed);
		}
		if(left)
		{
			moveLeft(speed);
		}
		if(right)
		{
			moveRight(speed);
		}
		checkAndCorrectCircle();
    }
	
	public void checkAndCorrectCircle()
	{
		// Check if the circle is intersecting the left wall
		if(circleX < circleRadius)
		{
			circleX = circleRadius; // Correct it
		}
		// Check if the circle is intersecting the right wall
		if(circleX > SCREEN_WIDTH - circleRadius)
		{
			circleX = SCREEN_WIDTH - circleRadius; // Correct it
		}
		// Check if the circle is intersecting the top wall
		if(circleY < circleRadius)
		{
			circleY = circleRadius; // Correct it
		}
		// Check if the circle is intersecting the bottom wall
		if (circleY > SCREEN_HEIGHT - circleRadius) 
		{
			circleY = SCREEN_HEIGHT - circleRadius; // Correct it
		}
	}
	
	// Functions to move the circle
	public void moveUp(int amount)
	{
		circleY -= amount;
	}
	public void moveDown(int amount)
	{
		circleY += amount;
	}
	public void moveLeft(int amount)
	{
		circleX -= amount;
	}
	public void moveRight(int amount)
	{
		circleX += amount;
	}
	
	// Setters
	public void setLeft(boolean input)
	{
		left = input;
	}
	public void setRight(boolean input)
	{
		right = input;
	}
	public void setUp(boolean input)
	{
		up = input;
	}
	public void setDown(boolean input)
	{
		down = input;
	}
}
