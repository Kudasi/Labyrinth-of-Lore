package drive.labyrinth.game;

import com.badlogic.gdx.Game;
import com.kotcrab.vis.ui.VisUI;

import drive.labyrinth.game.screens.MainMenuScreen;

public class Core extends Game {

	public static MainMenuScreen mainMenu;
	
	@Override
	public void create () {
		VisUI.load();

		mainMenu = new MainMenuScreen();

		setScreen(mainMenu);
	}

}
