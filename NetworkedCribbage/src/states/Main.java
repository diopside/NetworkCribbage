package states;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame{

	public static final int WIDTH = 1280, HEIGHT = WIDTH * 9 /16;
	
	
	public Main(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		
	}
	
	public static void main(String[] args){
		
		try {
			AppGameContainer container = new AppGameContainer(new Main("Cribbage"), WIDTH, HEIGHT, false);
			container.setTargetFrameRate(100);
			container.setShowFPS(false);
			container.setSmoothDeltas(true);
			container.start();
		} catch (SlickException exception) {
			exception.printStackTrace();
		}
		
		
	}

	
	
	
}
