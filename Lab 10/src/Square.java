import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle {
	
	public Square(Point pointUL, int width, Color color, boolean filled)
	{
		super(pointUL, width, width, color, filled);
		
		location = new Point[4];
		location[0] = pointUL;
		location[1] = new Point(pointUL.x, pointUL.y + width);
		location[2] = new Point(pointUL.x + width, pointUL.y);
		location[3] = new Point(pointUL.x + width, pointUL.y + width);
	}

}
