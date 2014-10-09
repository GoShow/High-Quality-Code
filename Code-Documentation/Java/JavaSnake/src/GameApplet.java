import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class GameApplet extends Applet {
	private Game gameSnake;
	EventKeyListener IH;
	
	public void init(){
		gameSnake = new Game();
		gameSnake.setPreferredSize(new Dimension(800, 650));
		gameSnake.setVisible(true);
		gameSnake.setFocusable(true);
		this.add(gameSnake);
		this.setVisible(true);
		this.setSize(new Dimension(800, 650));
		IH = new EventKeyListener(gameSnake);
	}
	
	public void paint(Graphics g){
		this.setSize(new Dimension(800, 650));
	}

}
