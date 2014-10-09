import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Apple {
	public static Random randomGenerator;
	private PointOfSnake apple;
	private Color appleColor;

	public Apple(Snake s) {
		apple = createApple(s);
		appleColor = Color.RED;
	}

	/**
	 * Create apple with random position.
	 * @param s Current snake.
	 * @return Return point element of type PointOfSnake
	 */
	private PointOfSnake createApple(Snake s) {
		randomGenerator = new Random();
		int x = randomGenerator.nextInt(30) * 20;
		int y = randomGenerator.nextInt(30) * 20;
		for (PointOfSnake snakePoint : s.snakeBody) {
			if (x == snakePoint.getX() || y == snakePoint.getY()) {
				return createApple(s);
			}
		}

		return new PointOfSnake(x, y);
	}

	
	public void drawApple(Graphics g) {
		apple.draw(g, appleColor);
	}

	
	public PointOfSnake getApple() {
		return apple;
	}
}
