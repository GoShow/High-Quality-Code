import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

public class Snake{
	LinkedList<PointOfSnake> snakeBody = new LinkedList<PointOfSnake>();
	private Color snakeColor;
	private int velocityX, velocityY;
	
	public Snake() {
		this.snakeColor = Color.GREEN;
		this.snakeBody.add(new PointOfSnake(300, 100)); 
		this.snakeBody.add(new PointOfSnake(280, 100)); 
		this.snakeBody.add(new PointOfSnake(260, 100)); 
		this.snakeBody.add(new PointOfSnake(240, 100)); 
		this.snakeBody.add(new PointOfSnake(220, 100)); 
		this.snakeBody.add(new PointOfSnake(200, 100)); 
		this.snakeBody.add(new PointOfSnake(180, 100));
		this.snakeBody.add(new PointOfSnake(160, 100));
		this.snakeBody.add(new PointOfSnake(140, 100));
		this.snakeBody.add(new PointOfSnake(120, 100));

		this.velocityX = 20;
		this.velocityY = 0;
	}
	
	public void drawSnake(Graphics g) {		
		for (PointOfSnake point : this.snakeBody) {
			point.draw(g, this.snakeColor);
		}
	}
	
	public void tick() {
		PointOfSnake head = new PointOfSnake((this.snakeBody.get(0).getX() + this.velocityX), (this.snakeBody.get(0).getY() + this.velocityY));
		
		if (head.getX() > Game.WIDTH - 20) {
		 	Game.gameRunning = false;
		} else if (head.getX() < 0) {
			Game.gameRunning = false;
		} else if (head.getY() < 0) {
			Game.gameRunning = false;
		} else if (head.getY() > Game.HEIGHT - 20) {
			Game.gameRunning = false;
		} else if (Game.apple.getApple().equals(head)) {
			this.snakeBody.add(Game.apple.getApple());
			Game.apple = new Apple(this);
			Game.score += 50;
		} else if (this.snakeBody.contains(head)) {
			Game.gameRunning = false;
			System.out.println("You ate yourself");
		}	
		
		for (int i = this.snakeBody.size()-1; i > 0; i--) {
			this.snakeBody.set(i, new PointOfSnake(this.snakeBody.get(i-1)));
		}	
		
		this.snakeBody.set(0, head);
	}

	public int getVelocityX() {
		return this.velocityX;
	}

	public void setVelocityX(int velX) {
		this.velocityX = velX;
	}

	public int getVelocityY() {
		return this.velocityY;
	}

	public void setVelocityY(int velY) {
		this.velocityY = velY;
	}
}
