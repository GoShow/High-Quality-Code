import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class GameApplet extends Applet {
	private Player game;
	KeyCapturer IH;
	
	public void init(){
		game = new Player();
		game.setPreferredSize(new Dimension(800, 650));
		game.setVisible(true);
		game.setFocusable(true);
		this.add(game);
		this.setVisible(true);
		this.setSize(new Dimension(800, 650));
		IH = new KeyCapturer(game);
	}
	
	public void paint(Graphics g){
		this.setSize(new Dimension(800, 650));
	}

}
