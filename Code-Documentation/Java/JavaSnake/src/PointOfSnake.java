import java.awt.Color;
import java.awt.Graphics;

/**
 *  One element of the snake.
 */
public class PointOfSnake {
	private int x, y;
	private final int width = 20;
	private final int height = 20;
	
	/**
	 * Clones element of the snake.
	 * @param p Element of the snake.
	 */
	public PointOfSnake(PointOfSnake p){
		this(p.x, p.y);
	}
	
	/**
	 * Creates new element of the snake on position X and Y.
	 * @param x X coordinate
	 * @param y Y coordinate
	 */
	public PointOfSnake(int x, int y){
		this.x = x;
		this.y = y;
	}	
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Draws snake's element.
	 * @param g Object of class Graphics.
	 */
	public void draw(Graphics g, Color color) {
		g.setColor(Color.BLACK);
		g.fillRect(this.x, this.y, this.width, this.height);
		g.setColor(color);
		g.fillRect(this.x + 1, this.y + 1, this.width - 2, this.height - 2);
	}
	
	public String toString() {
		return "[x = " + this.x + ", y = " + this.y + "]";
	}
	
	public boolean equals(Object object) {
        if (object instanceof PointOfSnake) {
            PointOfSnake point = (PointOfSnake)object;
            return (this.x == point.x) && (this.y == point.y);
        }
        
        return false;
    }
}
